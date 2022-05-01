# Write your MySQL query statement below
# #Easy #Database #2022_03_04_Time_401_ms_(79.45%)_Space_0B_(100.00%)
SELECT SecondDate.id as Id
FROM Weather SecondDate JOIN Weather FirstDate
ON ADDDATE(FirstDate.recordDate,1) = SecondDate.recordDate
AND SecondDate.temperature > FirstDate.temperature;