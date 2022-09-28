# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_2_Select_and_Order #2022_06_28_Time_903_ms_(48.10%)_Space_0B_(100.00%)
DELETE FROM Person
WHERE Id NOT IN (SELECT id FROM (SELECT Email, MIN(Id) AS id FROM Person GROUP BY Email) t)
