# Write your MySQL query statement below
# #Easy #Database #2025_02_04_Time_451_ms_(70.84%)_Space_0.0_MB_(100.00%)
select user_id, email from users
where email regexp '^[A-Za-z0-9_]+@[A-Za-z][A-Za-z0-9_]*\.com$'
order by user_id
