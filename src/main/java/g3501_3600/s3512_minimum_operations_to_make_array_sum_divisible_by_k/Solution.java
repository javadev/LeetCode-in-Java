package g3501_3600.s3512_minimum_operations_to_make_array_sum_divisible_by_k;

// #Easy #2025_04_13_Time_1_ms_(100.00%)_Space_45.01_MB_(100.00%)

public class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum % k;
    }
}
