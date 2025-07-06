package g3601_3700.s3603_minimum_cost_path_with_alternating_directions_ii;

// #Medium #2025_07_06_Time_7_ms_(99.88%)_Space_64.11_MB_(100.00%)

public class Solution {
    public long minCost(int m, int n, int[][] waitCost) {
        long[] dp = new long[n];
        dp[0] = 1L;
        for (int j = 1; j < n; j++) {
            long entry = j + 1L;
            long wait = waitCost[0][j];
            dp[j] = dp[j - 1] + entry + wait;
        }
        for (int i = 1; i < m; i++) {
            long entry00 = i + 1L;
            long wait00 = waitCost[i][0];
            dp[0] = dp[0] + entry00 + wait00;
            for (int j = 1; j < n; j++) {
                long entry = (long) (i + 1) * (j + 1);
                long wait = waitCost[i][j];
                long fromAbove = dp[j];
                long fromLeft = dp[j - 1];
                dp[j] = Math.min(fromAbove, fromLeft) + entry + wait;
            }
        }
        return dp[n - 1] - waitCost[m - 1][n - 1];
    }
}
