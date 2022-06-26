# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_5_Union #2022_06_26_Time_491_ms_(32.30%)_Space_0B_(100.00%)
SELECT FirstName, LastName, City, State
FROM Person LEFT JOIN Address USING (PersonId)
