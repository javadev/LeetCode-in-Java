# Write your MySQL query statement below
# #Easy #Database #2023_06_05_Time_779_ms_(66.08%)_Space_0B_(100.00%)
SELECT MAX(num) AS num
FROM (SELECT num, COUNT(num)
      FROM MyNumbers
      GROUP BY num
      HAVING COUNT(num) = 1) t
