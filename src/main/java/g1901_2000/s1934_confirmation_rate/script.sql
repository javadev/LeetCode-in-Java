# Write your MySQL query statement below
# #Medium #Database #2023_08_17_Time_1432_ms_(68.14%)_Space_0B_(100.00%)
WITH base_table AS (
    SELECT
        t.user_id,
        ROUND(t.total_confirmed / t.total_messages,2) AS confirmation_rate
    FROM (
        SELECT
            user_id ,
            SUM(CASE WHEN action='confirmed' THEN 1 ELSE 0 END) AS total_confirmed,
            COUNT(*) AS total_messages
        FROM confirmations
        GROUP BY 1
    ) t
)
SELECT
    s.user_id,
    COALESCE(bt.confirmation_rate,0) AS confirmation_rate
FROM signups s
LEFT JOIN base_table bt
ON s.user_id = bt.user_id
