# Write your MySQL query statement below
# #Hard #2025_02_16_Time_383_ms_(85.47%)_Space_0.0_MB_(100.00%)
WITH cte_invalid_ip AS (
    SELECT log_id, ip
    FROM logs
    WHERE NOT regexp_like(ip, '^(?:[1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(?:[.](?:[1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])){3}$')
  ),
  cte_invalid_ip_count AS (
    SELECT ip, count(log_id) as invalid_count
    FROM cte_invalid_ip
    GROUP BY ip
  )
SELECT ip, invalid_count
FROM cte_invalid_ip_count
ORDER BY invalid_count DESC, ip DESC;
