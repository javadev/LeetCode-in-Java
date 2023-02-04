# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_8_Function #2022_05_09_Time_571_ms_(73.59%)_Space_0B_(100.00%)
SELECT user_id, MAX(time_stamp) AS last_stamp
FROM Logins
WHERE YEAR(time_stamp) = '2020'
GROUP BY 1;
