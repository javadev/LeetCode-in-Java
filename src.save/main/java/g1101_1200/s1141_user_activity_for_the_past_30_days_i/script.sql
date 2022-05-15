# Write your MySQL query statement below
# #Easy #Database #Acceptance_52.3% #SQL_I_Day_7_Function
# #2022_05_05_Time_459_ms_(54.44%)_Space_0B_(100.00%)
SELECT activity_date AS day, COUNT(DISTINCT user_id) AS active_users
FROM Activity
GROUP BY day
HAVING day > (SELECT SUBDATE("2019-07-27", INTERVAL 30 DAY))
