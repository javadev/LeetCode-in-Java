# Write your MySQL query statement below
# #Medium #Database #2022_03_21_Time_274_ms_(65.75%)_Space_0B_(100.00%)
select
    id,
    case when id % 2 = 1 and lead(student) over (order by id) is null then student 
         when id % 2 = 1 then lead(student) over (order by id)
         else lag(student) over (order by id)
    end as student
from seat
order by id asc
