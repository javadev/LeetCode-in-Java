# Write your MySQL query statement below
SELECT c.Name as Customers 
FROM Customers as c
LEFT JOIN Orders as o
ON c.Id = o.CustomerId  
WHERE o.CustomerId is null