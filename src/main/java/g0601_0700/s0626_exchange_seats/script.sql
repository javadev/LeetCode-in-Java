# Write your MySQL query statement below
# #Medium #Database
select
    id,
    case when id % 2 = 1 and lead(student) over (order by id) is null then student 
         when id % 2 = 1 then lead(student) over (order by id)
         else lag(student) over (order by id)
    end as student
from seat
order by id asc
