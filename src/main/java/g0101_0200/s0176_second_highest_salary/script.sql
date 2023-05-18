# Write your MySQL query statement below
# #Medium #Database #SQL_I_Day_4_Union_and_Select
# #2022_07_10_Time_225_ms_(73.10%)_Space_0B_(100.00%)
SELECT ifnull(
                (SELECT distinct(Salary)
                 FROM Employee
                 ORDER BY Salary DESC
                 LIMIT 1
                 OFFSET 1), NULL) SecondHighestSalary;
