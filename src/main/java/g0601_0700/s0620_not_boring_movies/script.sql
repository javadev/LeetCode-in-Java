# Write your MySQL query statement below
# #Easy #Database #2022_03_21_Time_258_ms_(28.33%)_Space_0B_(100.00%)
SELECT *
FROM cinema
WHERE description != 'boring'
AND ID % 2 = 1
ORDER BY rating desc;
