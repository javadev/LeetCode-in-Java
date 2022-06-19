# Write your MySQL query statement below
# #Medium #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_4_Union_and_Select
# #2022_04_14_Time_347_ms_(95.17%)_Space_0B_(100.00%)
select id,case
            when p_id is null then 'Root'
            when id in (select p_id from tree)  then 'Inner'
            else 'Leaf'
            end as type
from tree;
