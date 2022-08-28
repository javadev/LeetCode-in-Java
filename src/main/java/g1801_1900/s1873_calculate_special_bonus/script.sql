# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_2_Select_and_Order #2022_05_12_Time_543_ms_(71.60%)_Space_0B_(100.00%)
select employee_id,
CASE
WHEN employee_id%2 = 1 and name NOT LIKE'M%'
THEN salary
ELSE 0
END AS bonus
from employees
