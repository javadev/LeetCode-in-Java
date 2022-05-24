# Write your MySQL query statement below
# #Medium #Database #SQL_I_Day_9_Control_of_Flow
# #2022_05_24_Time_457_ms_(79.39%)_Space_0B_(100.00%)
SELECT
    stock_name, 
    SUM(IF (operation = 1, price, -1 * price)) AS capital_gain_loss
FROM
    Stocks
GROUP BY
    stock_name
ORDER BY
    operation_day;
