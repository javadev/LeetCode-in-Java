# Write your MySQL query statement below
# #Easy #Database
DELETE FROM Person
WHERE Id NOT IN (SELECT id FROM (SELECT Email, MIN(Id) AS 'id' FROM Person GROUP BY Email) t)