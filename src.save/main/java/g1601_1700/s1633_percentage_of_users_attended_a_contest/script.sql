# Write your MySQL query statement below
# #Easy #Database #2023_08_16_Time_1550_ms_(95.68%)_Space_0B_(100.00%)
SELECT r.contest_id,
ROUND(COUNT(r.user_id) / (SELECT COUNT(user_id) FROM Users) * 100,2) as percentage
FROM Users u LEFT JOIN Register r ON u.user_id=r.user_id
WHERE contest_id IS NOT NULL
GROUP BY r.contest_id
ORDER BY percentage DESC, contest_id ASC
