# Write your MySQL query statement below
# #Easy #Database #2023_06_09_Time_1788_ms_(91.74%)_Space_0B_(100.00%)
select product.product_name, sales.sale_year, sales.price from sales
left join product on product.product_id = sales.product_id
