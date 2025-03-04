# Write your MySQL query statement below
# #Medium #2025_03_04_Time_645_ms_(100.00%)_Space_0.0_MB_(100.00%)
WITH SampleAnalysisCte AS (
    SELECT sample_id, dna_sequence, species,
        dna_sequence REGEXP '^ATG' AS has_start,
        dna_sequence REGEXP 'TAA$|TAG$|TGA$' AS has_stop,
        dna_sequence REGEXP '.*ATAT.*' AS has_atat,
        dna_sequence REGEXP '.*GGG.*' AS has_ggg
    FROM Samples
)

SELECT * FROM SampleAnalysisCte
ORDER BY sample_id;
