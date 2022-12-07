# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_7_Function #2022_04_13_Time_463_ms_(78.98%)_Space_0B_(100.00%)
select date_id, make_name, COUNT(DISTINCT lead_id) as unique_leads, COUNT(DISTINCT partner_id) as unique_partners from DailySales group by date_id, make_name
