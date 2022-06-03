# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_8_Function #2022_06_03_Time_392_ms_(90.54%)_Space_0B_(100.00%)
select customer_number from orders group by customer_number order by count(customer_number) desc limit 1