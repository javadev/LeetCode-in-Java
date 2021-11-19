# Write your MySQL query statement below
select Score, DENSE_RANK() OVER(order by Score Desc) as 'Rank' from Scores;

