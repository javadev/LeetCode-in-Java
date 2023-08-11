# Write your MySQL query statement below
# #Easy #Database #2023_06_05_Time_499_ms_(62.77%)_Space_0B_(100.00%)
SELECT *,
    CASE WHEN x+y>z AND y+z>x AND z+x>y THEN 'Yes' ELSE 'No' END AS triangle
FROM Triangle
