# Write your MySQL query statement below
# #Medium #Database #2023_08_12_Time_1205_ms_(78.39%)_Space_0B_(100.00%)
SELECT ROUND(AVG(CASE WHEN customer_pref_delivery_date = order_date THEN 1 ELSE 0 END) * 100, 2) AS immediate_percentage
FROM (
    SELECT *,
           DENSE_RANK() OVER(PARTITION BY customer_id ORDER BY order_date ASC) AS dnsrnk
    FROM delivery
) subquery_alias
WHERE subquery_alias.dnsrnk = 1;
