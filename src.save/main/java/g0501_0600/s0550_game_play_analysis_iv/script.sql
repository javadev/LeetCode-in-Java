# Write your MySQL query statement below
# #Medium #Database #2023_05_16_Time_685_ms_(100.00%)_Space_0B_(100.00%)
SELECT ROUND(COUNT(t2.player_id)/CAST(COUNT(t1.player_id) AS DECIMAL),2) AS fraction
FROM
(SELECT player_id, MIN(event_date) AS first_login FROM Activity GROUP BY player_id) t1 LEFT JOIN Activity t2
ON t1.player_id = t2.player_id AND t1.first_login = t2.event_date - 1
