# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_1_Select #2022_03_04_Time_581_ms_(23.03%)_Space_0B_(100.00%)
SELECT c.Name as Customers 
FROM Customers as c
LEFT JOIN Orders as o
ON c.Id = o.CustomerId  
WHERE o.CustomerId is null
