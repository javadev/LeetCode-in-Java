# Write your MySQL query statement below
# #Easy #Database
SELECT *
FROM cinema
WHERE description != "boring"
AND ID % 2 = 1
ORDER BY rating desc;