package g0101_0200.s0188_best_time_to_buy_and_sell_stock_iv;

// #Hard #Array #Dynamic_Programming

public class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[] dp = new int[k + 1];
        int[] maxdp = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            maxdp[i] = Integer.MIN_VALUE;
        }
        for (int i = 1; i <= n; i++) {
            maxdp[0] = Math.max(maxdp[0], dp[0] - prices[i - 1]);
            for (int j = k; j >= 1; j--) {
                maxdp[j] = Math.max(maxdp[j], dp[j] - prices[i - 1]);
                dp[j] = Math.max(maxdp[j - 1] + prices[i - 1], dp[j]);
            }
        }
        return dp[k];
    }
}
