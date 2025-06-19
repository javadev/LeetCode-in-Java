# Write your MySQL query statement below
# #Medium #Database #2025_06_19_Time_471_ms_(97.17%)_Space_0.0_MB_(100.00%)
-- mysql
-- SELECT 
--     p.patient_id,
--     p.patient_name,
--     p.age,
--     DATEDIFF(
--         min(neg.test_date),
--         min(pos.test_date)
--     ) AS recovery_time
-- FROM 
--     patients p
--     JOIN covid_tests pos ON
--         p.patient_id = pos.patient_id AND pos.result = 'Positive'
--     JOIN covid_tests neg ON 
--         p.patient_id = neg.patient_id AND neg.result = 'Negative'
-- WHERE 
--     neg.test_date > pos.test_date
-- GROUP BY 
--     p.patient_id, p.patient_name, p.age
-- ORDER BY 
--     recovery_time, p.patient_name;
select 
    p.patient_id,
    p.patient_name,
    p.age,
    datediff(
        day, 
        pos.first_pos_date, 
        neg.first_neg_date
    ) as recovery_time
from 
    patients p
    join (
        select patient_id, min(test_date) as first_pos_date 
        from covid_tests 
        where result = 'Positive'
        group by patient_id
    ) pos on p.patient_id = pos.patient_id
    join (
        select 
            c1.patient_id, 
            min(c1.test_date) as first_neg_date
        from 
            covid_tests c1
            join (
                select patient_id, min(test_date) as first_pos_date 
                from covid_tests 
                where result = 'Positive'
                group by patient_id
            ) p2 on c1.patient_id = p2.patient_id
        where 
            c1.result = 'Negative'
            and c1.test_date > p2.first_pos_date
        group by c1.patient_id
    ) neg on p.patient_id = neg.patient_id
order by 
    recovery_time ASC, p.patient_name ASC;
