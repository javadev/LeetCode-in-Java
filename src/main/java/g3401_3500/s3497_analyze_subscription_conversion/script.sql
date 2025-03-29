# Write your MySQL query statement below
# #Medium #2025_03_29_Time_347_ms_(100.00%)_Space_0.0_MB_(100.00%)
SELECT 
    ft.user_id,
    ROUND(ft.avg_trial, 2) AS trial_avg_duration,
    ROUND(pt.avg_paid, 2) AS paid_avg_duration
FROM
    (SELECT user_id, AVG(activity_duration) AS avg_trial
     FROM UserActivity
     WHERE activity_type = 'free_trial'
     GROUP BY user_id) ft
JOIN
    (SELECT user_id, AVG(activity_duration) AS avg_paid
     FROM UserActivity
     WHERE activity_type = 'paid'
     GROUP BY user_id) pt
ON ft.user_id = pt.user_id
ORDER BY ft.user_id;
