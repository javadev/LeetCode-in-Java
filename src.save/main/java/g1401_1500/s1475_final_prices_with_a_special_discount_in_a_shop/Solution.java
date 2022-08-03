package g1401_1500.s1475_final_prices_with_a_special_discount_in_a_shop;

// #Easy #Array #Stack #Monotonic_Stack #2022_04_04_Time_2_ms_(80.33%)_Space_44.8_MB_(17.62%)

public class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            boolean foundDiscount = false;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    foundDiscount = true;
                    break;
                }
            }
            if (!foundDiscount) {
                result[i] = prices[i];
            }
        }
        result[prices.length - 1] = prices[prices.length - 1];
        return result;
    }
}
