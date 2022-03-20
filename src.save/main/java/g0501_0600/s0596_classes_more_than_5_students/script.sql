# Write your MySQL query statement below
# #Easy #Database #2022_03_20_Time_243_ms_(92.65%)_Space_0B_(100.00%)
select class
from Courses
group by class
having count(student) >= 5