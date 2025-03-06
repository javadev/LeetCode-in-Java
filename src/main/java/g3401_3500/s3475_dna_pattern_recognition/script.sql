# Write your MySQL query statement below
# #Medium #Database #2025_03_06_Time_362_ms_(83.49%)_Space_0.0_MB_(100.00%)
WITH SampleAnalysisCte AS (
    SELECT sample_id, dna_sequence, species,
        dna_sequence REGEXP '^ATG' AS has_start,
        dna_sequence REGEXP 'TAA$|TAG$|TGA$' AS has_stop,
        dna_sequence REGEXP '.*ATAT.*' AS has_atat,
        dna_sequence REGEXP '.*GGG.*' AS has_ggg
    FROM Samples
)

SELECT sample_id, dna_sequence, species, has_start, has_stop, has_atat, has_ggg
FROM SampleAnalysisCte
ORDER BY sample_id ASC;
