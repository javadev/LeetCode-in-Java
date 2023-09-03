# Write your MySQL query statement below
# #Easy #Database #2023_08_16_Time_429_ms_(79.06%)_Space_0B_(100.00%)
select act1.machine_id,round(avg(act2.timestamp-act1.timestamp),3) as processing_time from activity act1 join activity act2 on act1.machine_id=act2.machine_id
where act1.process_id = act2.process_id and act1.activity_type ='start'
and act2.activity_type = 'end' group by act1.machine_id;
