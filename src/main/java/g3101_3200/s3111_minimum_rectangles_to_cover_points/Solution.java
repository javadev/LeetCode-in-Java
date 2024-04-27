package g3101_3200.s3111_minimum_rectangles_to_cover_points;

// #Medium #Array #Sorting #Greedy #2024_04_27_Time_4_ms_(99.55%)_Space_97.4_MB_(47.05%)

import java.util.Arrays;

public class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int res = 0;
        int last = -1;
        for (int[] a : points) {
            if (a[0] > last) {
                res++;
                last = a[0] + w;
            }
        }
        return res;
    }
}
