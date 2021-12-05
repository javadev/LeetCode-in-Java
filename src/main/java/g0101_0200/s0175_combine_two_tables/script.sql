# Write your MySQL query statement below
# #Easy #Database
SELECT FirstName, LastName, City, State
FROM Person LEFT JOIN Address USING (PersonId)