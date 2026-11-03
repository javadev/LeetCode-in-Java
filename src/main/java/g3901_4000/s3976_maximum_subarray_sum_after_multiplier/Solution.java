package g3901_4000.s3976_maximum_subarray_sum_after_multiplier;

// #Medium #Array #Dynamic_Programming #Staff #Weekly_Contest_508
// #2026_11_03_Time_5_ms_(100.00%)_Space_113.06_MB_(81.25%)

public class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long max = Long.MIN_VALUE;
        long used = 0;
        long div = 0;
        long sum = 0;
        for (int x : nums) {
            used = Math.max(used, div) + x;
            div = Math.max(sum, div) + x / k;
            sum += x;
            max = Math.max(Math.max(max, sum * k), Math.max(used, div));
            sum = Math.max(sum, 0);
        }
        return max;
    }
}
