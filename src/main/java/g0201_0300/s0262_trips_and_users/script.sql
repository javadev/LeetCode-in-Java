﻿# Write your MySQL query statement below
SELECT T.Request_at AS Day, ROUND(SUM(if(T.Status <> 'completed', 1,0))/COUNT(*),2) AS `Cancellation Rate` FROM Trips AS T LEFT JOIN (SELECT * FROM Users WHERE Role = 'client') AS C ON T.Client_Id = C.Users_Id LEFT JOIN (SELECT * FROM Users WHERE Role = 'driver') AS D ON T.Driver_Id = D.Users_Id WHERE C.Banned <> 'YES' AND D.Banned <> 'YES' AND T.Request_at BETWEEN '2013-10-01' AND '2013-10-03' GROUP BY T.Request_at ORDER BY Day;