# Write your MySQL query statement below
# #Medium #Database #2025_01_17_Time_466_ms_(74.56%)_Space_0B_(100.00%)

WITH Ranked AS (
    SELECT
    student_id,
    subject,
    FIRST_VALUE(score) OVER(PARTITION BY student_id,subject ORDER BY exam_date) AS first_score,
    FIRST_VALUE(score) OVER(PARTITION BY student_id,subject ORDER BY exam_date DESC) AS latest_score
    FROM Scores
)

SELECT * FROM Ranked
WHERE first_score<latest_score
GROUP BY student_id,subject
ORDER BY student_id,subject
