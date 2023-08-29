# Write your MySQL query statement below
# #Easy #Database #2023_08_14_Time_1735_ms_(83.69%)_Space_0B_(100.00%)
SELECT s.student_id, s.student_name, sub.subject_name,
sum(case when sub.subject_name = e.subject_name then 1 else 0 end) as attended_exams
FROM Students s
cross join subjects sub
left join examinations e on e.student_id=s.student_id
group by 1,2,3
order by 1,2,3
