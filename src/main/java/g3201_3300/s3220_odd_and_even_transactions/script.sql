# Write your MySQL query statement below
# #Medium #Database #2024_07_23_Time_248_ms_(85.85%)_Space_0B_(100.00%)
select transaction_date,
sum(case when amount%2<>0 then amount else 0 end) as odd_sum,
sum(case when amount%2=0 then amount else 0 end) as even_sum from transactions
group by transaction_date order by transaction_date asc;
