# Write your MySQL query statement below
# #Easy #Database #Acceptance_69.1% #SQL_I_Day_10_Where
# #2022_03_04_Time_345_ms_(59.47%)_Space_0B_(100.00%)
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email) > 1;
