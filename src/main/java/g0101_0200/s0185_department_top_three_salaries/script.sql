# Write your MySQL query statement below
# #Hard #Database #2022_06_27_Time_643_ms_(95.52%)_Space_0B_(100.00%)
SELECT D.name AS Department,
       A.name AS Employee,
       A.salary AS Salary
FROM
    (SELECT *,
            dense_rank() over(PARTITION BY departmentID
                ORDER BY salary DESC) AS rn
     FROM Employee) A
        INNER JOIN Department D ON A.departmentid = D.id
WHERE A.rn < 4
ORDER BY Department, Salary DESC
