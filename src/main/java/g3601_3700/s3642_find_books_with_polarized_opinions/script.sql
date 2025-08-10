# Write your MySQL query statement below
# #Easy #Database #2025_08_10_Time_490_ms_(100.00%)_Space_0.0_MB_(100.00%)
WITH book_stats AS (
    SELECT
        book_id,
        COUNT(*) AS total_sessions,
        SUM(CASE WHEN session_rating <> 3 THEN 1 ELSE 0 END) AS extreme_ratings,
        MAX(session_rating) AS max_rating,
        MIN(session_rating) AS min_rating,
        SUM(CASE WHEN session_rating > 3 THEN 1 ELSE 0 END) AS high_ratings,
        SUM(CASE WHEN session_rating <= 2 THEN 1 ELSE 0 END) AS low_ratings
    FROM reading_sessions
    GROUP BY book_id
)
SELECT
    bs.book_id,
    b.title,
    b.author,
    b.genre,
    b.pages,
    (bs.max_rating - bs.min_rating) AS rating_spread,
    ROUND(bs.extreme_ratings * 1.0 / bs.total_sessions, 2) AS polarization_score
FROM book_stats bs
JOIN books b USING (book_id)
WHERE 
    bs.total_sessions >= 5
    AND bs.high_ratings > 0
    AND bs.low_ratings > 0
    AND (bs.extreme_ratings * 1.0 / bs.total_sessions) >= 0.6
ORDER BY polarization_score DESC, b.title DESC;
