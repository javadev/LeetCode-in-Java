# Write your MySQL query statement below
# #Easy #Database #2025_06_03_Time_512_ms_(100.00%)_Space_0.0_MB_(100.00%)
SELECT
    book_id,
    MAX(title) AS title,
    MAX(author) AS author,
    MAX(genre) AS genre,
    MAX(publication_year) AS publication_year,
    MAX(total_copies) AS current_borrowers
FROM (
    SELECT
        book_id,
        title,
        author,
        genre,
        publication_year,
        total_copies,
        total_copies AS total_remain
    FROM library_books
    UNION ALL
    SELECT
        book_id,
        '' AS title,
        '' AS author,
        '' AS genre,
        1000 AS publication_year,
        0 AS total_copies,
        -1 AS total_remain
    FROM borrowing_records
    WHERE return_date IS NULL
) AS sub
GROUP BY
    book_id
HAVING
    SUM(total_remain) = 0
ORDER BY
    current_borrowers DESC,
    title ASC;
