package g1601_1700.s1637_widest_vertical_area_between_two_points_containing_no_points;

// #Easy #Array #Sorting #2022_04_20_Time_17_ms_(74.19%)_Space_78.6_MB_(62.28%)

import java.util.Arrays;

public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xValues = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            xValues[i] = points[i][0];
        }
        Arrays.sort(xValues);
        int max = 0;
        for (int j = 0; j < xValues.length - 1; j++) {
            if (xValues[j + 1] - xValues[j] > max) {
                max = xValues[j + 1] - xValues[j];
            }
        }
        return max;
    }
}
