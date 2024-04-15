# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_1_Select #2022_08_25_Time_262_ms_(84.64%)_Space_0B_(100.00%)
select name, population, area
from world
where area >= 3000000
or population >= 25000000
