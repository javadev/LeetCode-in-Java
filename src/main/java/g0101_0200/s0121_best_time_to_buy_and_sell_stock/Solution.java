package g0101_0200.s0121_best_time_to_buy_and_sell_stock;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Data_Structure_I_Day_3_Array #Dynamic_Programming_I_Day_7 #Level_1_Day_5_Greedy #Udemy_Arrays
// #Top_Interview_150_Array/String #Big_O_Time_O(N)_Space_O(1)
// #2024_11_13_Time_1_ms_(99.78%)_Space_61.8_MB_(27.61%)

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
