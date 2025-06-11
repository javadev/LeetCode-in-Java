# Write your MySQL query statement below
# #Medium #Database #2025_06_11_Time_449_ms_(91.67%)_Space_0.0_MB_(100.00%)
WITH Ranked AS (
    SELECT
        employee_id,
        name,
        review_date,
        rating,
        RANK() OVER (
            PARTITION BY employee_id
            ORDER BY review_date DESC
        ) AS rnk,
        LAG(rating) OVER (
            PARTITION BY employee_id
            ORDER BY review_date DESC
        ) AS lag_rating 
    FROM employees
    LEFT JOIN performance_reviews
        USING (employee_id)
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
    AND SUM(lag_rating > rating) = 2
ORDER BY
    improvement_score DESC,
    name ASC;
