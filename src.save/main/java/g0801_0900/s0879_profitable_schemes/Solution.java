package g0801_0900.s0879_profitable_schemes;

// #Hard #Array #Dynamic_Programming #2022_03_28_Time_80_ms_(43.42%)_Space_42.9_MB_(71.71%)

public class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        long[][] dp = new long[n + 1][minProfit + 1];
        long modulus = 1000000007L;
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < group.length; i++) {
            int currWorker = group[i];
            int currProfit = profit[i];
            for (int j = dp.length - 1; j >= currWorker; j--) {
                for (int k = dp[j].length - 1; k >= 0; k--) {
                    dp[j][k] =
                            (dp[j][k] + dp[j - currWorker][Math.max((k - currProfit), 0)])
                                    % modulus;
                }
            }
        }
        return (int) dp[n][minProfit];
    }
}
