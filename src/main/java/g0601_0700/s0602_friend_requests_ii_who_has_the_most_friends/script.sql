# Write your MySQL query statement below
# #Medium #Database #2023_06_05_Time_510_ms_(60.15%)_Space_0B_(100.00%)
SELECT req AS id, COUNT(acc) AS num
FROM
((SELECT requester_id AS req, accepter_id AS acc
FROM requestaccepted)
UNION
(SELECT accepter_id AS req, requester_id AS acc
FROM requestaccepted)) t
GROUP BY req
ORDER BY num DESC
LIMIT 1
