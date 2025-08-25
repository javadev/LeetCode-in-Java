# Write your MySQL query statement below
# #Medium #Database #2025_08_25_Time_297_ms_(100.00%)_Space_0.0_MB_(100.00%)
SELECT 
    customer_id
FROM 
    customer_transactions
GROUP BY 
    customer_id
HAVING 
    COUNT(CASE WHEN transaction_type = 'purchase' THEN 1 END) > 2
    AND TIMESTAMPDIFF(DAY, MIN(transaction_date), MAX(transaction_date)) > 29
    AND (COUNT(CASE WHEN transaction_type = 'refund' THEN 1 END) * 1.0 / COUNT(*)) < 0.2
ORDER BY 
    customer_id ASC;
