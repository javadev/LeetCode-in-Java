# #Hard #2026_07_21_Time_367_ms_(16.77%)_Space_0.0_MB_(100.00%)
# Write your MySQL query statement below
WITH distinct_activity AS (
    SELECT DISTINCT
        user_id,
        action,
        action_date
    FROM activity
),
numbered_activity AS (
    SELECT
        user_id,
        action,
        action_date,
        DATEADD(
            'DAY',
            -ROW_NUMBER() OVER (
                PARTITION BY user_id, action
                ORDER BY action_date
            ),
            action_date
        ) AS streak_group
    FROM distinct_activity
),
streaks AS (
    SELECT
        user_id,
        action,
        COUNT(*) AS streak_length,
        MIN(action_date) AS start_date,
        MAX(action_date) AS end_date
    FROM numbered_activity
    GROUP BY
        user_id,
        action,
        streak_group
    HAVING COUNT(*) >= 5
),
ranked_streaks AS (
    SELECT
        user_id,
        action,
        streak_length,
        start_date,
        end_date,
        ROW_NUMBER() OVER (
            PARTITION BY user_id
            ORDER BY
                streak_length DESC,
                end_date DESC,
                action ASC
        ) AS priority
    FROM streaks
)
SELECT
    user_id,
    action,
    streak_length,
    start_date,
    end_date
FROM ranked_streaks
WHERE priority = 1
ORDER BY
    streak_length DESC,
    user_id ASC;
