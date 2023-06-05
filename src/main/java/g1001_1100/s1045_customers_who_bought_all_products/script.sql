# Write your MySQL query statement below
# #Medium #Database #2023_06_05_Time_1082_ms_(43.17%)_Space_0B_(100.00%)
select customer_id
from customer
group by customer_id
having count(distinct product_key)=(select count(*) from product);
