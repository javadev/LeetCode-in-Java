# Write your MySQL query statement below
# #Easy #Database #2025_02_26_Time_292_ms_(90.91%)_Space_0.0_MB_(100.00%)
SELECT * FROM products WHERE description REGEXP 'SN[0-9]{4}-[0-9]{4}$'
OR description REGEXP 'SN[0-9]{4}-[0-9]{4}[^0-9]+' ORDER BY product_id
