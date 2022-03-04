# Write your MySQL query statement below
# #Medium #Database #2022_03_04_Time_576_ms_(64.14%)_Space_0B_(100.00%)
SELECT
    d.Name AS Department,
    Sel.Name AS Employee,
    Sel.Salary AS Salary
FROM
(
    SELECT
        Name,
        Salary,
        DepartmentId,
        DENSE_RANK() OVER (PARTITION BY DepartmentId ORDER BY Salary DESC) AS dr
    FROM Employee 
) AS Sel
INNER JOIN Department d ON d.Id = Sel.DepartmentId
WHERE Sel.dr = 1