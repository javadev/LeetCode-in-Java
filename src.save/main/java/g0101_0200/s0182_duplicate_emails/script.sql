# Write your MySQL query statement below
# #Easy #Database #2022_03_04_Time_345_ms_(59.47%)_Space_0B_(100.00%)
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email) > 1;