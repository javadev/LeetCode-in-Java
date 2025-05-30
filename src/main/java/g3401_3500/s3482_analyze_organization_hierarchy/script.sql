# Write your MySQL query statement below
# #Hard #Database #2025_05_30_Time_294_ms_(80.03%)_Space_0.0_MB_(100.00%)
WITH RECURSIVE org_hierarchy (
    orig_employee_id,
    orig_employee_name,
    employee_id,
    employee_name,
    manager_id,
    salary,
    org_level
) AS (
    SELECT
        employee_id AS orig_employee_id,
        employee_name AS orig_employee_name,
        employee_id,
        employee_name,
        manager_id,
        salary,
        1 AS org_level
    FROM Employees

    UNION ALL

    SELECT
        P.orig_employee_id,
        P.orig_employee_name,
        CH.employee_id,
        CH.employee_name,
        CH.manager_id,
        CH.salary,
        P.org_level + 1
    FROM org_hierarchy P
    JOIN Employees CH ON CH.manager_id = P.employee_id
),
CEO_hierarchy (
    sub_employee_id,
    employee_name,
    sub_level
) AS (
    SELECT
        oh.employee_id AS sub_employee_id,
        oh.employee_name,
        oh.org_level AS sub_level
    FROM org_hierarchy oh
    JOIN Employees e ON oh.orig_employee_id = e.employee_id
    WHERE e.manager_id IS NULL
)

SELECT
    oh.orig_employee_id AS employee_id,
    oh.orig_employee_name AS employee_name,
    ch.sub_level AS level,
    COUNT(*) - 1 AS team_size,
    SUM(oh.salary) AS budget
FROM org_hierarchy oh
JOIN CEO_hierarchy ch ON oh.orig_employee_id = ch.sub_employee_id
GROUP BY
    oh.orig_employee_id,
    oh.orig_employee_name,
    ch.sub_level
ORDER BY
    level ASC, budget DESC, employee_name ASC;
