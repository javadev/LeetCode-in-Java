# Write your MySQL query statement below
# #Easy #Database #2023_08_17_Time_719_ms_(64.69%)_Space_0B_(100.00%)
select employee_id from employees where manager_id not in (select distinct (employee_id)
 from employees) AND salary < 30000 order by employee_id
