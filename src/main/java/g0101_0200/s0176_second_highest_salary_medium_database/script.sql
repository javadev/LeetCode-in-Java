# Write your MySQL query statement below
SELECT ifnull(
                (SELECT distinct(Salary)
                 FROM Employee
                 ORDER BY Salary DESC
                 LIMIT 1
                 OFFSET 1), NULL) SecondHighestSalary;