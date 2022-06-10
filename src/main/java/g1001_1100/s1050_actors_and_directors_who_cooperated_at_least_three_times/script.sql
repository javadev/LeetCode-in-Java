# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_10_Where #2022_05_24_Time_344_ms_(76.48%)_Space_0B_(100.00%)
SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) > 2
