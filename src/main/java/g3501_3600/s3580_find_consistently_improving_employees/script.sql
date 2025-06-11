# Write your MySQL query statement below
# #Medium #Database #2025_06_11_Time_449_ms_(91.67%)_Space_0.0_MB_(100.00%)
WITH Ranked AS (
    SELECT
        e.employee_id,
        e.name,
        pr.review_date,
        pr.rating,
        RANK() OVER (
            PARTITION BY e.employee_id
            ORDER BY pr.review_date DESC
        ) AS rnk,
        LAG(pr.rating) OVER (
            PARTITION BY e.employee_id
            ORDER BY pr.review_date DESC
        ) AS lag_rating
    FROM employees e
    LEFT JOIN performance_reviews pr
        ON e.employee_id = pr.employee_id
)
SELECT
    employee_id,
    name,
    MAX(rating) - MIN(rating) AS improvement_score
FROM Ranked
WHERE rnk <= 3
GROUP BY
    employee_id,
    name
HAVING
    COUNT(*) = 3
    AND SUM(CASE WHEN lag_rating > rating THEN 1 ELSE 0 END) = 2
ORDER BY
    improvement_score DESC,
    name ASC;
