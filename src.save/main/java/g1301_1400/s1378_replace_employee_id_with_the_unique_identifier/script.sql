# Write your MySQL query statement below
# #Easy #Database #2023_08_15_Time_2747_ms_(40.02%)_Space_0B_(100.00%)
select u.unique_id, e.name
from Employees e
left join EmployeeUNI u
on e.id = u.id;
