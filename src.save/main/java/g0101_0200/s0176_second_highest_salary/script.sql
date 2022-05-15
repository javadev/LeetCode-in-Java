# Write your MySQL query statement below
# #Medium #Database #Acceptance_35.4% #SQL_I_Day_4_Union_&_Select
# #2022_03_04_Time_203_ms_(63.47%)_Space_0B_(100.00%)
SELECT ifnull(
                (SELECT distinct(Salary)
                 FROM Employee
                 ORDER BY Salary DESC
                 LIMIT 1
                 OFFSET 1), NULL) SecondHighestSalary;
