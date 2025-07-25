# Write your MySQL query statement below
# #Medium #2025_07_25_Time_516_ms_(100.00%)_Space_0.0_MB_(100.00%)
WITH store_product_check AS (
    SELECT 
        s.store_id,
        s.store_name,
        s.location,
        COUNT(i.inventory_id) AS store_product_ct
    FROM 
        stores s
        JOIN inventory i ON s.store_id = i.store_id
    GROUP BY 
        s.store_id,
        s.store_name,
        s.location
    HAVING 
        COUNT(i.inventory_id) >= 3
),
store_product_ranked AS (
    SELECT 
        s.store_id,
        s.store_name,
        s.location,
        i.inventory_id,
        i.product_name,
        i.quantity,
        i.price,
        ROW_NUMBER() OVER (PARTITION BY s.store_id ORDER BY i.price ASC) AS low_price_rk,
        ROW_NUMBER() OVER (PARTITION BY s.store_id ORDER BY i.price DESC) AS high_price_rk
    FROM
        stores s
        JOIN inventory i ON s.store_id = i.store_id
),
high_low_price AS (
    SELECT 
        spc.store_id,
        spc.store_name,
        spc.location,
        lp.product_name AS low_price_product_name,
        lp.quantity + 0.0 AS low_price_quantity,
        hp.product_name AS high_price_product_name,
        hp.quantity + 0.0 AS high_price_quantity
    FROM 
        store_product_check spc
        JOIN store_product_ranked lp 
            ON spc.store_id = lp.store_id AND lp.low_price_rk = 1
        JOIN store_product_ranked hp 
            ON spc.store_id = hp.store_id AND hp.high_price_rk = 1
)
SELECT 
    hlp.store_id,
    hlp.store_name,
    hlp.location,
    hlp.high_price_product_name AS most_exp_product,
    hlp.low_price_product_name AS cheapest_product,
    ROUND(hlp.low_price_quantity / hlp.high_price_quantity, 2) AS imbalance_ratio
FROM
    high_low_price hlp
WHERE
    hlp.high_price_quantity < hlp.low_price_quantity
ORDER BY
    imbalance_ratio DESC, 
    hlp.store_name ASC;
