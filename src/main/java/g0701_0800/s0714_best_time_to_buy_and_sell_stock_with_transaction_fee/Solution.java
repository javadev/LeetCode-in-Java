package g0701_0800.s0714_best_time_to_buy_and_sell_stock_with_transaction_fee;

// #Medium #Array #Dynamic_Programming #Greedy

public class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }
}
