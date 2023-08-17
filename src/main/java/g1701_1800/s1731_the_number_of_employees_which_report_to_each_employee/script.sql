# Write your MySQL query statement below
# #Easy #Database #2023_08_16_Time_1162_ms_(87.26%)_Space_0B_(100.00%)
SELECT
    t1.employee_id,
    t1.name,
    count(t2.reports_to) as reports_count,
    ROUND(avg(t2.age)) as average_age
FROM
    Employees t1
INNER JOIN Employees t2 on t1.employee_id = t2.reports_to
GROUP BY 1, 2
ORDER BY employee_id
