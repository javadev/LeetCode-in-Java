package g3501_3600.s3573_best_time_to_buy_and_sell_stock_v;

// #Medium #Array #Dynamic_Programming #2025_06_10_Time_10_ms_(99.46%)_Space_44.46_MB_(97.36%)

public class Solution {
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        long[] prev = new long[n];
        long[] curr = new long[n];
        for (int t = 1; t <= k; t++) {
            long bestLong = -prices[0];
            long bestShort = prices[0];
            curr[0] = 0;
            for (int i = 1; i < n; i++) {
                long res = curr[i - 1];
                res = Math.max(res, prices[i] + bestLong);
                res = Math.max(res, -prices[i] + bestShort);
                curr[i] = res;
                bestLong = Math.max(bestLong, prev[i - 1] - prices[i]);
                bestShort = Math.max(bestShort, prev[i - 1] + prices[i]);
            }
            long[] tmp = prev;
            prev = curr;
            curr = tmp;
        }
        return prev[n - 1];
    }
}
