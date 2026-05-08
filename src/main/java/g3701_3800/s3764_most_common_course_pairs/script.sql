# Write your MySQL query statement below
# #Hard #2026_05_08_Time_262_ms_(63.61%)_Space_0.0_MB_(100.00%)
-- Find the most common course-to-next-course transitions
-- among engaged users (>=5 courses, avg rating >= 4)
SELECT
  course_name AS first_course,
  next_course AS second_course,
  COUNT(*) AS transition_count
FROM (
  SELECT
    *,
    LEAD(course_name) OVER (
      PARTITION BY user_id
      ORDER BY completion_date
    ) AS next_course
  FROM course_completions
  WHERE user_id IN (
    SELECT user_id
    FROM course_completions
    GROUP BY user_id
    HAVING COUNT(course_id) >= 5
       AND AVG(course_rating) >= 4
  )
) AS t
WHERE next_course IS NOT NULL
GROUP BY course_name, next_course
ORDER BY transition_count DESC, first_course ASC, second_course ASC;
