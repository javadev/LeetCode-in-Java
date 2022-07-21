# Write your MySQL query statement below
# #Hard #Database #2022_03_21_Time_328_ms_(62.41%)_Space_0B_(100.00%)
select id, visit_date, people
from 
(select 

id, visit_date, people, 
 lead(people, 1) over ( order by id) as one_next, 
 lead(people, 2) over ( order by id) as two_next,
 lag(people, 1) over ( order by id) as one_prev,
 lag(people, 2) over ( order by id) as two_prev

from Stadium
) a

where (people >= 100) and

(
    (one_next >= 100 and two_next >=100) or
    (one_prev >= 100 and two_prev >=100) or
    (one_prev >= 100 and one_next >=100)
)
