# Write your MySQL query statement below
# #Hard #Database #2022_07_05_Time_420_ms_(95.80%)_Space_0B_(100.00%)
SELECT request_at AS "Day",
       ROUND(cast(SUM(CASE
                     WHEN t.status != 'completed' THEN 1
                     ELSE 0
                 END) as decimal(7,2))/count(*), 2) AS "Cancellation Rate"
FROM Trips t
INNER JOIN Users a ON (a.users_id = t.client_id)
AND (a.banned='No')
INNER JOIN Users b ON (b.users_id = t.driver_id)
AND (b.banned='No')
WHERE request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY request_at;
