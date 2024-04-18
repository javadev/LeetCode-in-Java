package g3001_3100.s3091_apply_operations_to_make_sum_of_array_greater_than_or_equal_to_k;

// #Medium #Math #Greedy #Enumeration #2024_04_18_Time_0_ms_(100.00%)_Space_40.6_MB_(62.55%)

public class Solution {
    public int minOperations(int k) {
        int a = (int) Math.sqrt(k);
        return a + (k - 1) / a - 1;
    }
}
