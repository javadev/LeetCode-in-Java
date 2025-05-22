# Write your MySQL query statement below
# #Easy #Database #2022_06_27_Time_315_ms_(94.44%)_Space_0B_(100.00%)
SELECT
    a.Name AS Employee
FROM
    Employee a
    LEFT JOIN Employee b ON a.ManagerId = b.Id
WHERE
    a.Salary > b.Salary
    AND a.ManagerId IS NOT NULL;
