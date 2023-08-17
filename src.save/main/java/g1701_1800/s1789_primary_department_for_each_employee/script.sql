# Write your MySQL query statement below
# #Easy #Database #2023_08_16_Time_1122_ms_(74.47%)_Space_0B_(100.00%)
WITH cte AS (
    SELECT DISTINCT employee_id, department_id,
           COUNT(employee_id) OVER (PARTITION BY employee_id) AS n
    FROM Employee
)
SELECT employee_id, department_id
FROM cte
WHERE n = 1
UNION
SELECT employee_id, department_id
FROM Employee
WHERE primary_flag = 'Y';
