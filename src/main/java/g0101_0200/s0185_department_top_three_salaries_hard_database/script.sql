# Write your MySQL query statement below
SELECT d.Name AS Department, e.Name AS Employee, e.Salary
FROM Employee e
JOIN Department d
ON e.DepartmentId = d.Id
WHERE e.Salary IN (
    SELECT e2.Salary FROM (
        SELECT DISTINCT e3.Salary FROM Employee e3
        WHERE e3.DepartmentID = d.Id
        ORDER BY e3.Salary DESC
        LIMIT 3
    ) AS e2
);