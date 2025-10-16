# Write your MySQL query statement below
# #Medium #Database #2025_10_16_Time_256_ms_(96.87%)_Space_0.0_MB_(100.00%)
WITH UserStats AS (
    SELECT 
        user_id, 
        MIN(CASE WHEN event_type = 'start' THEN event_date END) AS start_date,
        MAX(event_date) AS last_event,
        MAX(monthly_amount) AS max_revenue,
        SUM(CASE WHEN event_type = 'downgrade' THEN 1 ELSE 0 END) AS downgrade_count
    FROM subscription_events
    GROUP BY user_id
)
SELECT
    us.user_id,
    se.plan_name AS current_plan,
    se.monthly_amount AS current_monthly_amount,
    us.max_revenue AS max_historical_amount,
    TIMESTAMPDIFF(DAY, us.start_date, us.last_event) AS days_as_subscriber
FROM UserStats us
JOIN subscription_events se
    ON us.user_id = se.user_id
   AND us.last_event = se.event_date
WHERE se.event_type <> 'cancel'
  AND us.downgrade_count > 0
  AND se.monthly_amount * 2 < us.max_revenue
  AND TIMESTAMPDIFF(DAY, us.start_date, us.last_event) > 60
ORDER BY
    TIMESTAMPDIFF(DAY, us.start_date, us.last_event) DESC,
    us.user_id ASC;
