# Write your MySQL query statement below
# #Hard #Database #2025_05_22_Time_623_ms_(82.76%)_Space_0.0_MB_(100.00%)
SELECT
    pi1.category AS category1,
    pi2.category AS category2,
    COUNT(DISTINCT pp1.user_id) AS customer_count
FROM
    ProductPurchases pp1,
    ProductPurchases pp2,
    ProductInfo pi1,
    ProductInfo pi2
WHERE
    pp1.user_id = pp2.user_id
    AND pi1.category < pi2.category
    AND pp1.product_id = pi1.product_id
    AND pp2.product_id = pi2.product_id
GROUP BY
    pi1.category,
    pi2.category
HAVING
    COUNT(DISTINCT pp1.user_id) >= 3
ORDER BY
    customer_count DESC,
    category1 ASC,
    category2 ASC;
