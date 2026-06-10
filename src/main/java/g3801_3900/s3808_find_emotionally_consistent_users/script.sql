# #Medium #2026_06_09_Time_290_ms_(87.69%)_Space_0.0_MB_(100.00%)
# Write your MySQL query statement below
WITH user_selection AS
(SELECT
    user_id,
    COUNT(reaction) AS total_reaction_count
FROM
    reactions
GROUP BY
    user_id
HAVING
    COUNT(DISTINCT content_id) >= 5
),
reaction_counts
AS
(SELECT
    user_id,
    reaction,
    COUNT(*) AS reaction_count
FROM
reactions
group by
    user_id,
    reaction
),
ranked_reactions AS (
    -- Step 2: Use a window function to find the max for each user
    SELECT
        user_id,
        reaction,
        reaction_count,
        RANK() OVER(PARTITION BY user_id ORDER BY reaction_count DESC) as rnk
    FROM reaction_counts
)
SELECT
    rc.user_id,
    rc.reaction AS dominant_reaction,
    ROUND(reaction_count / total_reaction_count, 2) AS reaction_ratio
FROM
    ranked_reactions rc
INNER JOIN
    user_selection us
ON
    rc.user_id = us.user_id
WHERE
    rc.rnk = 1
    AND ROUND(reaction_count / total_reaction_count, 2) >= 0.60
ORDER BY
    3 DESC,
    rc.user_id
