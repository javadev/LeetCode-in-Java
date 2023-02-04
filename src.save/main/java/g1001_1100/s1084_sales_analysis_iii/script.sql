# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_10_Where
# #2022_05_24_Time_1066_ms_(69.71%)_Space_0B_(100.00%)
SELECT DISTINCT P.product_id, P.product_name FROM Product P
INNER JOIN Sales S ON S.product_id = P.product_id
WHERE S.sale_date BETWEEN '2019-01-01' AND '2019-03-31'
AND P.product_id NOT IN (SELECT P1.product_id FROM Product P1
                         INNER JOIN Sales S1 ON S1.product_id = P1.product_id
                         WHERE S1.sale_date NOT BETWEEN '2019-01-01' AND '2019-03-31');
