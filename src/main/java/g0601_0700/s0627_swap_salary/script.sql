# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_2_Select_and_Order #2022_03_21_Time_191_ms_(96.89%)_Space_0B_(100.00%)
UPDATE Salary SET sex = CASE WHEN sex = 'm' THEN 'f' ELSE 'm' END WHERE TRUE;
