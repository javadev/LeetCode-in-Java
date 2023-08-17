# Write your MySQL query statement below
# #Easy #Database #2023_08_16_Time_1184_ms_(78.28%)_Space_0B_(100.00%)
SELECT tweet_id FROM Tweets
WHERE LENGTH(content) > 15;
