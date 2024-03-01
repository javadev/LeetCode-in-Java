# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_9_Control_of_Flow
# #2022_03_28_Time_682_ms_(70.16%)_Space_0B_(100.00%)
SELECT U.NAME , COALESCE(SUM(R.DISTANCE),0) AS travelled_distance
FROM USERS U LEFT JOIN RIDES R ON U.ID=R.USER_ID
GROUP BY 1 ORDER BY 2 DESC , 1 ASC
