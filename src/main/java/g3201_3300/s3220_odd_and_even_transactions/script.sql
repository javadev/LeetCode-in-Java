# Write your MySQL query statement below
# #Medium #2024_07_18_Time_272_ms_(100.00%)_Space_0B_(100.00%)
select transaction_date,
sum(case when amount%2<>0 then amount else 0 end) as odd_sum,
sum(case when amount%2=0 then amount else 0 end) as even_sum from transactions
group by transaction_date order by transaction_date;
