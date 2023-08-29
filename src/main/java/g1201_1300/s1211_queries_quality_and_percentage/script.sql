# Write your MySQL query statement below
# #Easy #Database #2023_08_14_Time_1230_ms_(82.08%)_Space_0B_(100.00%)
SELECT query_name,
ROUND(AVG(rating/position), 2) AS quality,
ROUND(AVG((rating<3)*100), 2) AS poor_query_percentage
FROM Queries
GROUP BY query_name
