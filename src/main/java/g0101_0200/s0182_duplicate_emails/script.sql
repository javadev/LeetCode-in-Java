# Write your MySQL query statement below
# #Easy #Database
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email) > 1;