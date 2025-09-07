package g3601_3700.s3674_minimum_operations_to_equalize_array;

// #Easy #Weekly_Contest_466 #2025_09_07_Time_1_ms_(100.00%)_Space_43.98_MB_(100.00%)

public class Solution {
    public int minOperations(int[] nums) {
        for (int num : nums) {
            if (num != nums[0]) return 1;
        }
        return 0;
    }
}
