package g0101_0200.s0122_best_time_to_buy_and_sell_stock_ii;

// #Medium #Top_Interview_Questions #Array #Dynamic_Programming #Greedy #Dynamic_Programming_I_Day_7
// #Udemy_Arrays #Top_Interview_150_Array/String
// #2025_03_06_Time_1_ms_(76.91%)_Space_45.72_MB_(69.34%)

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
