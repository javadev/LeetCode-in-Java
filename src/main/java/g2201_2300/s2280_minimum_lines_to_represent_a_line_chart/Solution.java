package g2201_2300.s2280_minimum_lines_to_represent_a_line_chart;

// #Medium #Array #Math #Sorting #Geometry #Number_Theory
// #2022_06_15_Time_40_ms_(96.09%)_Space_89.1_MB_(92.63%)

import java.util.Arrays;

public class Solution {
    public int minimumLines(int[][] stockPrices) {
        if (stockPrices.length == 1) {
            return 0;
        }
        Arrays.sort(stockPrices, (a, b) -> a[0] - b[0]);
        // multiply with 1.0 to make it double and multiply with 100 for making it big so that
        // difference won't come out to be very less and after division it become 0.
        // failing for one of the case without multiply 100
        double lastSlope =
                (stockPrices[1][1] - stockPrices[0][1])
                        * 100
                        / ((stockPrices[1][0] - stockPrices[0][0]) * 1.0);
        int ans = 1;
        for (int i = 2; i < stockPrices.length; i++) {
            double curSlope =
                    (stockPrices[i][1] - stockPrices[i - 1][1])
                            * 100
                            / ((stockPrices[i][0] - stockPrices[i - 1][0]) * 1.0);
            if (lastSlope != curSlope) {
                lastSlope = curSlope;
                ans++;
            }
        }
        return ans;
    }
}
