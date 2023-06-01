# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_7_Function
# #2023_06_01_Time_849_ms_(72.54%)_Space_0B_(100.00%)
SELECT activity_date as "day", COUNT(DISTINCT user_id) AS active_users
FROM activity
WHERE (activity_date > '2019-06-27' AND activity_date <= '2019-07-27') 
GROUP BY activity_date;
