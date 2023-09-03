# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_3_String_Processing_Functions
# #2022_04_06_Time_395_ms_(77.20%)_Space_0B_(100.00%)
SELECT sell_date, COUNT(DISTINCT(product)) as num_sold, GROUP_CONCAT(DISTINCT(product) ORDER BY product) as products
FROM Activities
GROUP BY sell_date
