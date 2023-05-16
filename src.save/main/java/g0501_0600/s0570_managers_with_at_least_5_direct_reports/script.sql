# Write your MySQL query statement below
# #Medium #Database #2023_05_16_Time_503_ms_(69.79%)_Space_0B_(100.00%)
select e.name
from employee m left join employee e
on m.managerid = e.id
group by e.name
having count(e.name) > 4;
