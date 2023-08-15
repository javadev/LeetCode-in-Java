# Write your MySQL query statement below
# #Medium #Database #2023_08_15_Time_2843_ms_(48.31%)_Space_0B_(100.00%)
(SELECT name results
FROM Users as U, MovieRating as  MR
WHERE U.user_id = MR.user_id
GROUP BY U.user_id
ORDER BY COUNT(MR.user_id) DESC, name ASC LIMIT 1)
UNION ALL
(SELECT title results
FROM Movies as M, MovieRating as MR
WHERE M.movie_id = MR.movie_id AND created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY M.movie_id
ORDER BY AVG(rating) DESC, title ASC LIMIT 1)
