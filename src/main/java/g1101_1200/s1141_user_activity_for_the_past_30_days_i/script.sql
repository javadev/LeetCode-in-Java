# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_7_Function
# #2022_05_24_Time_543_ms_(29.24%)_Space_0B_(100.00%)
select activity_date as "day", count(distinct user_id) as active_users
from Activity
where activity_date between '2019-06-28' and '2019-07-27'
group by "day"
having count(activity_type) > 0;
