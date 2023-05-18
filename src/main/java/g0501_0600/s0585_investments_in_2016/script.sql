# Write your MySQL query statement below
# #Medium #Database #2023_05_18_Time_729_ms_(99.22%)_Space_0B_(100.00%)
select round(sum(tiv_2016),2) tiv_2016 from insurance i1
where tiv_2015 in (select tiv_2015 from insurance i2
                where i1.pid != i2.pid)
and (lat, lon) not in (select lat, lon from insurance i3
                    where i3.pid != i1.pid)
