package g3601_3700.s3652_best_time_to_buy_and_sell_stock_using_strategy;

// #Medium #Weekly_Contest_463 #2025_08_17_Time_5_ms_(94.85%)_Space_57.60_MB_(83.20%)

public class Solution {
    public long maxProfit(int[] p, int[] s, int k) {
        int n = p.length;
        long[] p1 = new long[n + 1];
        long[] p2 = new long[n + 1];
        for (int i = 0; i < n; i++) {
            p1[i + 1] = p1[i] + (long) s[i] * p[i];
            p2[i + 1] = p2[i] + p[i];
        }
        long max = 0;
        for (int i = 0; i <= n - k; i++) {
            int m = i + k / 2;
            int e = i + k;
            long op = p1[e] - p1[i];
            long np = p2[e] - p2[m];
            max = Math.max(max, np - op);
        }
        return p1[n] + max;
    }
}
