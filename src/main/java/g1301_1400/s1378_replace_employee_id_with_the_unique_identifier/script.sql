# Write your MySQL query statement below
# #Easy #Database #2023_08_16_Time_2498_ms_(63.60%)_Space_0B_(100.00%)
select u.unique_id, e.name
from Employees e
left join EmployeeUNI u
on e.id = u.id;
