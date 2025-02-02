# #Easy #2025_02_02_Time_256_(100.00%)_Space_0.0_(100.00%)
# Write your MySQL query statement below
select user_id, email from users
where email regexp '^[A-Za-z0-9_]+@[A-Za-z][A-Za-z0-9_]*\.com$'
order by user_id
