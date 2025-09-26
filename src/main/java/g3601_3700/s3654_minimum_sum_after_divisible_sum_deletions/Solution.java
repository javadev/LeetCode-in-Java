package g3601_3700.s3654_minimum_sum_after_divisible_sum_deletions;

// #Medium #Array #Hash_Table #Dynamic_Programming #Prefix_Sum #Weekly_Contest_463
// #2025_09_26_Time_17_ms_(91.65%)_Space_59.64_MB_(68.62%)

import java.util.Arrays;

public class Solution {
    public long minArraySum(int[] nums, int k) {
        long[] dp = new long[k];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        long res = 0;
        for (int a : nums) {
            res += a;
            int index = (int) (res % k);
            res = dp[index] = Math.min(dp[index], res);
        }
        return res;
    }
}
