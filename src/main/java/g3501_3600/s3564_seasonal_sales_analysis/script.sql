# Write your MySQL query statement below
# #Medium #Database #2025_05_26_Time_505_ms_(100.00%)_Space_0.0_MB_(100.00%)
WITH cte AS (
    SELECT CASE 
            WHEN MONTH(sale_date) IN (1, 2, 12) THEN 'Winter'
            WHEN MONTH(sale_date) IN (3, 4, 5) THEN 'Spring'
            WHEN MONTH(sale_date) IN (6, 7, 8) THEN 'Summer'
            WHEN MONTH(sale_date) IN (9, 10, 11) THEN 'Fall'
        END AS season,
        category, SUM(quantity) AS total_quantity, SUM(quantity * price) AS total_revenue
    FROM sales s
    JOIN products p ON s.product_id = p.product_id
    GROUP BY season, category
),
cte2 AS (
    SELECT season, category, total_quantity, total_revenue,
        RANK() OVER (PARTITION BY season ORDER BY total_quantity DESC, total_revenue DESC) AS ranking
    FROM cte
)
SELECT 
    season, category, total_quantity, total_revenue
FROM cte2
WHERE ranking = 1
ORDER BY season ASC;
