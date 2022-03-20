# Write your MySQL query statement below
# #Easy #Database #2022_03_20_Time_241_ms_(92.61%)_Space_0B_(100.00%)
select name, population, area
from world
where area >= 3000000
or population >= 25000000