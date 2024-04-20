# Write your MySQL query statement below
# #Medium #Database #2022_06_26_Time_550_ms_(48.44%)_Space_0B_(100.00%)
select distinct num as ConsecutiveNums from
(select num, lag(num,1) over(order by id) as l1, lag(num,2) over(order by id) as l2
from Logs) con_thr
where num = l1 and num = l2
