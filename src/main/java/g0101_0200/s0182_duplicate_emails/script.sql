# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_10_Where #2022_06_27_Time_303_ms_(92.08%)_Space_0B_(100.00%)
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email) > 1;
