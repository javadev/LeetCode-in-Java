package g3401_3500.s3500_minimum_cost_to_divide_array_into_subarrays;

// #Hard #Array #Dynamic_Programming #Prefix_Sum
// #2025_04_01_Time_26_ms_(93.46%)_Space_44.97_MB_(94.77%)

@SuppressWarnings("java:S107")
public class Solution {
    public long minimumCost(int[] nums, int[] cost, int k) {
        int n = nums.length;
        long kLong = k;
        long[] preNums = new long[n + 1];
        long[] preCost = new long[n + 1];
        for (int i = 0; i < n; i++) {
            preNums[i + 1] = preNums[i] + nums[i];
            preCost[i + 1] = preCost[i] + cost[i];
        }
        long[] dp = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = Long.MAX_VALUE / 2;
        }
        dp[0] = 0L;
        for (int r = 1; r <= n; r++) {
            for (int l = 0; l < r; l++) {
                long sumNums = preNums[r] * (preCost[r] - preCost[l]);
                long sumCost = kLong * (preCost[n] - preCost[l]);
                dp[r] = Math.min(dp[r], dp[l] + sumNums + sumCost);
            }
        }
        return dp[n];
    }
}
