package g3001_3100.s3027_find_the_number_of_ways_to_place_people_ii;

// #Hard #Array #Math #Sorting #Enumeration #Geometry
// #2024_03_01_Time_59_ms_(69.95%)_Space_45.3_MB_(20.75%)

import java.util.Arrays;

public class Solution {
    private int customCompare(int[] p1, int[] p2) {
        if (p1[0] != p2[0]) {
            return Integer.signum(p1[0] - p2[0]);
        }
        return Integer.signum(p2[1] - p1[1]);
    }

    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, this::customCompare);
        int count = 0;
        for (int i = 0; i < points.length; ++i) {
            int m = Integer.MIN_VALUE;
            for (int j = i + 1; j < points.length; ++j) {
                if ((points[i][1] >= points[j][1]) && (points[j][1] > m)) {
                    m = points[j][1];
                    count++;
                }
            }
        }
        return count;
    }
}
