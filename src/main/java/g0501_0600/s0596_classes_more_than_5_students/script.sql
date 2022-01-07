# Write your MySQL query statement below
# #Easy #Database
select class
from Courses
group by class
having count(student) >= 5