# Write your MySQL query statement below
# #Easy #Database #2023_08_16_Time_1356_ms_(75.95%)_Space_0B_(100.00%)
SELECT *
FROM Users
WHERE mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com'
