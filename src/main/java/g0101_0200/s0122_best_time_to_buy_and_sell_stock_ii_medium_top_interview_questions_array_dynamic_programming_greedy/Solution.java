package g0101_0200.s0122_best_time_to_buy_and_sell_stock_ii_medium_top_interview_questions_array_dynamic_programming_greedy;

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
