# Write your MySQL query statement below
# #Medium #Database #2023_08_12_Time_1693_ms_(90.17%)_Space_0B_(100.00%)
WITH ab AS (SELECT *, RANK() OVER(PARTITION BY product_id ORDER BY sale_year ASC) AS rk
FROM Sales)
SELECT product_id, sale_year AS first_year, quantity, price
FROM ab
WHERE rk = 1;
