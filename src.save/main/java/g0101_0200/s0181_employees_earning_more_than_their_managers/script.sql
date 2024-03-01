# Write your MySQL query statement below
# #Easy #Database #2022_06_27_Time_315_ms_(94.44%)_Space_0B_(100.00%)
select a.Name as Employee from Employee a left join Employee b on a.ManagerId=b.Id
where a.Salary > b.Salary and a.ManagerId is not null
