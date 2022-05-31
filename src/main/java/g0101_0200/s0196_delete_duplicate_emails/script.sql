# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_2_Select_and_Order #2022_03_04_Time_541_ms_(81.09%)_Space_0B_(100.00%)
DELETE FROM Person
WHERE Id NOT IN (SELECT id FROM (SELECT Email, MIN(Id) AS 'id' FROM Person GROUP BY Email) t)
