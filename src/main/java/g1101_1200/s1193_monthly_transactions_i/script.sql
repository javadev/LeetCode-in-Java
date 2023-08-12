# Write your MySQL query statement below
# #Medium #Database #2023_08_12_Time_961_ms_(88.29%)_Space_0B_(100.00%)
SELECT
    FORMATDATETIME(trans_date, 'yyyy-MM') AS trans_month,
    country,
    COUNT(*) AS trans_count,
    SUM(CASE WHEN state = 'approved' THEN 1 ELSE 0 END) AS approved_count,
    SUM(amount) AS trans_total_amount,
    SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 END) AS approved_total_amount
FROM Transactions
GROUP BY trans_month, country;
