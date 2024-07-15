# Write your MySQL query statement below
# #Medium #Database #2024_07_15_Time_469_ms_(89.19%)_Space_0B_(100.00%)
SELECT DISTINCT l1.num AS ConsecutiveNums
FROM Logs l1
JOIN Logs l2 ON l1.id = l2.id - 1
JOIN Logs l3 ON l1.id = l3.id - 2
WHERE l1.num = l2.num AND l2.num = l3.num;
