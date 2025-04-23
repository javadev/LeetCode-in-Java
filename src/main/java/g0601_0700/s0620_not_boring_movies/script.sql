# Write your MySQL query statement below
# #Easy #Database #2025_04_23_Time_259_ms_(64.69%)_Space_0.0_MB_(100.00%)
SELECT id, movie, description, rating
FROM Cinema
WHERE description != 'boring' AND id % 2 != 0
ORDER BY rating DESC;
