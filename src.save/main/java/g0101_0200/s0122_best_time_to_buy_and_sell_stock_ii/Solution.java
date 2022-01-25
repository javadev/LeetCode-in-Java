package g0101_0200.s0122_best_time_to_buy_and_sell_stock_ii;

// #Medium #Top_Interview_Questions #Array #Dynamic_Programming #Greedy

public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }
}
