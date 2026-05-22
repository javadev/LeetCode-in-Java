# Write your MySQL query statement below
# #Easy #2026_05_22_Time_286_ms_(70.33%)_Space_0.0_MB_(100.00%)
SELECT user_id, COUNT(prompt) as prompt_count, ROUND(AVG(tokens),2) as avg_tokens
FROM prompts
GROUP BY user_id
HAVING prompt_count > 2 AND MAX(tokens) > avg_tokens
ORDER BY avg_tokens DESC, user_id asc;