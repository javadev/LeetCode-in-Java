package g0101_0200.s0123_best_time_to_buy_and_sell_stock_iii;

// #Hard #Array #Dynamic_Programming #2022_06_23_Time_4_ms_(87.18%)_Space_78.4_MB_(61.70%)

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int fb = Integer.MIN_VALUE;
        int sb = Integer.MIN_VALUE;
        int fs = 0;
        int ss = 0;
        for (int price : prices) {
            fb = Math.max(fb, -price);
            fs = Math.max(fs, fb + price);
            sb = Math.max(sb, fs - price);
            ss = Math.max(ss, sb + price);
        }
        return ss;
    }
}
