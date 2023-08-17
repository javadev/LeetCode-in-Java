# Write your MySQL query statement below
# #Medium #Database #2023_08_17_Time_2216_ms_(95.81%)_Space_0B_(100.00%)
select 'Low Salary' as category, count(*) as accounts_count from accounts where income<20000
union
select 'Average Salary' as category, count(*) as accounts_count from accounts where income>=20000 and income<=50000
union
select 'High Salary' as category, count(*) as accounts_count from accounts where income>50000
