# Write your MySQL query statement below
# #Medium #Database #2023_08_14_Time_775_ms_(61.73%)_Space_0B_(100.00%)
with cteX as
(select visited_on, sum(amount) as amount from customer
group by visited_on)

SELECT visited_on, SUM(amount) OVER(ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS amount,
round(AVG(amount) OVER(ROWS BETWEEN 6 PRECEDING AND CURRENT ROW), 2) as average_amount FROM cteX
order by visited_on
limit 6, 10000
