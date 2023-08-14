# Write your MySQL query statement below
# #Easy #Database #2023_08_14_Time_1413_ms_(86.28%)_Space_0B_(100.00%)
SELECT us.product_id,
       ROUND(SUM(p.price * us.units) / SUM(us.units), 2) AS average_price
  FROM UnitsSold us
       JOIN Prices p
       ON us.product_id = p.product_id
      AND us.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY us.product_id;
