package g3501_3600.s3573_best_time_to_buy_and_sell_stock_v;

// #Medium #2025_06_08_Time_259_ms_(100.00%)_Space_87.72_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    private static final long MN = (long) -1e14;
    private long[][][] dp;
    private int[] prices;

    private long f(int i, int k, int state) {
        if (i == prices.length) {
            return (state == 0) ? 0 : MN;
        }
        if (dp[i][k][state] != MN) {
            return dp[i][k][state];
        }
        long p = prices[i];
        long profit = MN;
        profit = Math.max(profit, f(i + 1, k, state));
        if (state == 0) {
            profit = Math.max(profit, f(i + 1, k, 1) - p);
            profit = Math.max(profit, f(i + 1, k, 2) + p);
        } else if (k > 0) {
            if (state == 1) {
                profit = Math.max(profit, f(i + 1, k - 1, 0) + p);
            } else {
                profit = Math.max(profit, f(i + 1, k - 1, 0) - p);
            }
        }
        return dp[i][k][state] = profit;
    }

    public long maximumProfit(int[] prices, int k) {
        this.prices = prices;
        int n = prices.length;
        dp = new long[n + 1][k + 1][3];
        for (long[][] twoD : dp) {
            for (long[] oneD : twoD) {
                Arrays.fill(oneD, MN);
            }
        }
        return f(0, k, 0);
    }
}
