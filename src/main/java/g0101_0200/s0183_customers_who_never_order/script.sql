# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_1_Select #2022_06_27_Time_376_ms_(98.73%)_Space_0B_(100.00%)
SELECT
    c.Name AS Customers
FROM
    Customers AS c
    LEFT JOIN Orders AS o ON c.Id = o.CustomerId
WHERE
    o.CustomerId IS NULL;
