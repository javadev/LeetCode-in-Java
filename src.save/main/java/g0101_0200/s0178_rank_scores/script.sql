# Write your MySQL query statement below
# #Medium #Database #Acceptance_57.6% #2022_03_04_Time_299_ms_(52.08%)_Space_0B_(100.00%)
select Score, DENSE_RANK() OVER(order by Score Desc) as "Rank" from Scores order by "Rank" Asc;
