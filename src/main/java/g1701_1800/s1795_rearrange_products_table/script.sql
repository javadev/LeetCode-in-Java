# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_4_Union_and_Select #2022_04_25_Time_497_ms_(64.83%)_Space_0B_(100.00%)
SELECT product_id, 'store1' AS store, store1 AS price
FROM Products
WHERE store1 IS NOT NULL
UNION
SELECT product_id, 'store2' AS store, store2 AS price
FROM Products
WHERE store2 IS NOT NULL
UNION
SELECT product_id, 'store3' AS store, store3 AS price
FROM Products
WHERE store3 IS NOT NULL;
