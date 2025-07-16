# Write your MySQL query statement below
# #Hard #Database #2025_07_16_Time_553_ms_(100.00%)_Space_0.0_MB_(100.00%)
-- WITH studentstudysummary AS (
--     SELECT
--         student_id,
--         SUM(hours_studied) AS total_study_hours,
--         COUNT(DISTINCT subject) AS cycle_length
--     FROM
--         study_sessions
--     GROUP BY
--         student_id
--     HAVING
--         COUNT(DISTINCT subject) >= 3
-- ),
-- rankedstudysessionswithgaps AS (
--     SELECT
--         ss.student_id,
--         ss.subject,
--         ss.session_date,
--         DATEDIFF(
--             LEAD(ss.session_date, 1, ss.session_date)
--                 OVER (PARTITION BY ss.student_id ORDER BY ss.session_date),
--             ss.session_date
--         ) AS gap_to_next_session,
--         ROW_NUMBER() OVER (PARTITION BY ss.student_id ORDER BY ss.session_date) AS rn,
--         sss.total_study_hours,
--         sss.cycle_length
--     FROM
--         study_sessions ss
--         INNER JOIN studentstudysummary sss
--             ON ss.student_id = sss.student_id
-- ),
-- cyclicstudents AS (
--     SELECT
--         rss1.student_id,
--         rss1.cycle_length,
--         rss1.total_study_hours
--     FROM
--         rankedstudysessionswithgaps rss1
--         INNER JOIN rankedstudysessionswithgaps rss2
--             ON rss1.student_id = rss2.student_id
--             AND rss2.rn = rss1.rn + rss1.cycle_length
--             AND rss1.subject = rss2.subject
--     WHERE
--         rss1.gap_to_next_session < 3
--         AND rss2.gap_to_next_session < 3
--     GROUP BY
--         rss1.student_id,
--         rss1.cycle_length,
--         rss1.total_study_hours
--     HAVING
--         COUNT(DISTINCT rss1.subject) >= 3
-- )
-- SELECT
--     s.student_id,
--     s.student_name,
--     s.major,
--     cs.cycle_length,
--     cs.total_study_hours
-- FROM
--     cyclicstudents cs
--     INNER JOIN students s
--         ON cs.student_id = s.student_id
-- ORDER BY
--     cs.cycle_length DESC,
--     cs.total_study_hours DESC;
WITH studentstudysummary AS (
    SELECT
        student_id,
        SUM(hours_studied) AS total_study_hours,
        COUNT(DISTINCT subject) AS cycle_length
    FROM study_sessions
    GROUP BY student_id
    HAVING COUNT(DISTINCT subject) >= 3
),
rankedstudysessionswithgaps AS (
    SELECT
        ss.student_id,
        ss.subject,
        ss.session_date,
        DATEDIFF('DAY',
            ss.session_date,
            LEAD(ss.session_date, 1, ss.session_date) OVER (
                PARTITION BY ss.student_id ORDER BY ss.session_date
            )
        ) AS gap_to_next_session,
        ROW_NUMBER() OVER (PARTITION BY ss.student_id ORDER BY ss.session_date) AS rn,
        sss.total_study_hours,
        sss.cycle_length
    FROM study_sessions ss
    INNER JOIN studentstudysummary sss
        ON ss.student_id = sss.student_id
),
cyclicstudents AS (
    SELECT
        rss1.student_id,
        rss1.cycle_length,
        rss1.total_study_hours
    FROM rankedstudysessionswithgaps rss1
    INNER JOIN rankedstudysessionswithgaps rss2
        ON rss1.student_id = rss2.student_id
        AND rss2.rn = rss1.rn + rss1.cycle_length
        AND rss1.subject = rss2.subject
    WHERE
        rss1.gap_to_next_session < 3
        AND rss2.gap_to_next_session < 3
    GROUP BY
        rss1.student_id,
        rss1.cycle_length,
        rss1.total_study_hours
    HAVING
        COUNT(DISTINCT rss1.subject) >= 3
)
SELECT
    s.student_id,
    s.student_name,
    s.major,
    cs.cycle_length,
    cs.total_study_hours
FROM cyclicstudents cs
INNER JOIN students s ON cs.student_id = s.student_id
ORDER BY cs.cycle_length DESC, cs.total_study_hours DESC;
