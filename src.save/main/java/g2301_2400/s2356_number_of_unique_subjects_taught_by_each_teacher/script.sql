# Write your MySQL query statement below
# #Easy #Database #2023_08_17_Time_964_ms_(79.65%)_Space_0B_(100.00%)
select teacher_id, count(distinct subject_id) as "cnt"
from Teacher
group by teacher_id
