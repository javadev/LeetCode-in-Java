# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_7_Function #2022_04_30_Time_456_ms_(88.39%)_Space_0B_(100.00%)
select user_id, count(follower_id) as followers_count
from followers
group by user_id
order by user_id
