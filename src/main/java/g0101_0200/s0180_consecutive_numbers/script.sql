# Write your MySQL query statement below
select distinct num as ConsecutiveNums from
(select num, lag(num,1) over() as l1, lag(num,2) over() as l2
from Logs) con_thr
where num = l1 and num = l2