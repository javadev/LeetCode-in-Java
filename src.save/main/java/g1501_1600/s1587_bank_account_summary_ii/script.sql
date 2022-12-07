# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_10_Where #2022_04_11_Time_630_ms_(60.32%)_Space_0B_(100.00%)
select u.name, sum(t.amount) as balance from Users as u join Transactions as t on u.account = t.account group by u.name having balance > 10000
