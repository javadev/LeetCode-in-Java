# Write your MySQL query statement below
# #Easy #Database #2023_05_18_Time_1473_ms_(95.83%)_Space_0B_(100.00%)
SELECT name, bonus
FROM Employee e
LEFT JOIN Bonus b ON e.empId = b.empId
WHERE bonus < 1000 or b.empId is null;
