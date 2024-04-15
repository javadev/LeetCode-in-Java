package g2101_2200.s2110_number_of_smooth_descent_periods_of_a_stock;

// #Medium #Array #Dynamic_Programming #Math #2022_05_31_Time_3_ms_(77.27%)_Space_95.2_MB_(34.45%)

public class Solution {
    public long getDescentPeriods(int[] prices) {
        long descendantCount = 0;
        int previousCounts = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] - prices[i + 1] == 1) {
                descendantCount++;
                if (previousCounts > 0) {
                    descendantCount += previousCounts;
                }
                previousCounts++;
            } else {
                previousCounts = 0;
            }
        }
        descendantCount += prices.length;
        return descendantCount;
    }
}
