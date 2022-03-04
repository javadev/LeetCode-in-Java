# Write your MySQL query statement below
# #Easy #Database #2022_03_04_Time_449_ms_(30.35%)_Space_0B_(100.00%)
SELECT FirstName, LastName, City, State
FROM Person LEFT JOIN Address USING (PersonId)