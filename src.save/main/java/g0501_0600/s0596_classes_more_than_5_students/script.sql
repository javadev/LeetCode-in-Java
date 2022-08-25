# Write your MySQL query statement below
# #Easy #Database #2022_08_25_Time_290_ms_(74.62%)_Space_0B_(100.00%)
select class
from Courses
group by class
having count(student) >= 5
