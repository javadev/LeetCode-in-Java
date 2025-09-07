# Write your MySQL query statement below
# #Hard #Database #2025_09_07_Time_278_ms_(100.00%)_Space_0.0_MB_(100.00%)
SELECT
    session_id,
    user_id,
    TIMESTAMPDIFF(MINUTE, MIN(event_timestamp), MAX(event_timestamp)) AS session_duration_minutes,
    SUM(CASE WHEN event_type = 'scroll' THEN 1 ELSE 0 END) AS scroll_count -- NOSONAR
FROM
    app_events
GROUP BY
    session_id,
    user_id
HAVING
    TIMESTAMPDIFF(MINUTE, MIN(event_timestamp), MAX(event_timestamp)) > 30
    AND SUM(CASE WHEN event_type = 'scroll' THEN 1 ELSE 0 END) > 4 -- NOSONAR
    AND (
        CAST(SUM(CASE WHEN event_type = 'click' THEN 1 ELSE 0 END) AS DOUBLE) /
        NULLIF(SUM(CASE WHEN event_type = 'scroll' THEN 1 ELSE 0 END), 0) -- NOSONAR
    ) < 0.2
    AND SUM(CASE WHEN event_type = 'purchase' THEN 1 ELSE 0 END) = 0
ORDER BY
    scroll_count DESC,
    session_id ASC;
