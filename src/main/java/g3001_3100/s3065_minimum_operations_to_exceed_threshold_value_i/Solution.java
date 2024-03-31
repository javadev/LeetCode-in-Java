package g3001_3100.s3065_minimum_operations_to_exceed_threshold_value_i;

// #Easy #Array #2024_03_31_Time_0_ms_(100.00%)_Space_42.7_MB_(48.42%)

public class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int num : nums) {
            if (num >= k) {
                count++;
            }
        }
        return nums.length - count;
    }
}
