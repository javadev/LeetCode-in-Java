package g3901_4000.s3914_minimum_operations_to_make_array_non_decreasing;

// #Medium #Array #Greedy #Staff #Weekly_Contest_499
// #2026_09_17_Time_2_ms_(100.00%)_Space_87.58_MB_(31.66%)

public class Solution {
    public long minOperations(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for (int i = 1; i < n; ++i) {
            ans += Math.max(nums[i - 1] - nums[i], 0);
        }
        return ans;
    }
}
