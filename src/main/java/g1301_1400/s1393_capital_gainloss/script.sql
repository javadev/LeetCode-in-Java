# Write your MySQL query statement below
# #Medium #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_9_Control_of_Flow
# #2022_07_26_Time_428_ms_(92.01%)_Space_0B_(100.00%)
SELECT stock_name, SUM(CASE WHEN operation='Sell' THEN price ELSE -price END) AS capital_gain_loss
FROM Stocks GROUP BY stock_name;
