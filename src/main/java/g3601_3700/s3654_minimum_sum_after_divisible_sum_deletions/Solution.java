package g3601_3700.s3654_minimum_sum_after_divisible_sum_deletions;

// #Medium #Weekly_Contest_463 #2025_08_17_Time_17_ms_(98.16%)_Space_60.80_MB_(48.62%)

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
