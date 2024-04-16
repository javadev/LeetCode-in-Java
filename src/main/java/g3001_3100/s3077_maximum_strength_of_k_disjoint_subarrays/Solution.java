package g3001_3100.s3077_maximum_strength_of_k_disjoint_subarrays;

// #Hard #Array #Dynamic_Programming #Prefix_Sum
// #2024_04_16_Time_20_ms_(97.16%)_Space_56.3_MB_(71.00%)

public class Solution {
    public long maximumStrength(int[] n, int k) {
        if (n.length == 1) {
            return n[0];
        }
        long[][] dp = new long[n.length][k];
        dp[0][0] = (long) k * n[0];
        for (int i = 1; i < k; i++) {
            long pm = -1;
            dp[i][0] = Math.max(0L, dp[i - 1][0]) + (long) k * n[i];
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + ((long) k - j) * n[i] * pm;
                pm = -pm;
            }
            dp[i][i] = dp[i - 1][i - 1] + ((long) k - i) * n[i] * pm;
        }
        long max = dp[k - 1][k - 1];
        for (int i = k; i < n.length; i++) {
            long pm = 1;
            dp[i][0] = Math.max(0L, dp[i - 1][0]) + (long) k * n[i];
            for (int j = 1; j < k; j++) {
                pm = -pm;
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + ((long) k - j) * n[i] * pm;
            }
            if (max < dp[i][k - 1]) {
                max = dp[i][k - 1];
            }
        }
        return max;
    }
}
