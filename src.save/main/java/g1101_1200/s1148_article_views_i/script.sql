# Write your MySQL query statement below
# #Easy #Database #Acceptance_76.7% #SQL_I_Day_5_Union
# #2022_04_15_Time_459_ms_(44.85%)_Space_0B_(100.00%)
select distinct author_id as id from Views where author_id = viewer_id order by author_id;
