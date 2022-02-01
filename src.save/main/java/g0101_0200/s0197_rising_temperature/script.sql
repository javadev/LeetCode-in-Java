# Write your MySQL query statement below
# #Easy #Database
SELECT SecondDate.id as Id
FROM Weather SecondDate JOIN Weather FirstDate
ON ADDDATE(FirstDate.recordDate,1) = SecondDate.recordDate
AND SecondDate.temperature > FirstDate.temperature;