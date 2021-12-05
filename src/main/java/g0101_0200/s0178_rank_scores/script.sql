# Write your MySQL query statement below
# #Medium #Database
select Score, DENSE_RANK() OVER(order by Score Desc) as "Rank" from Scores order by "Rank" Asc;

