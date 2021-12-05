package g0101_0200.s0121_best_time_to_buy_and_sell_stock_easy_top_100_liked_questions_top_interview_questions_array_dynamic_programming;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                maxProfit = Math.max(maxProfit, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        return maxProfit;
    }
}
