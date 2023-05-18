# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_5_Union
# #2022_04_15_Time_459_ms_(44.85%)_Space_0B_(100.00%)
select distinct author_id as id from Views where author_id = viewer_id order by author_id;
