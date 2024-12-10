package g3301_3400.s3380_maximum_area_rectangle_with_point_constraints_i;

// #Medium #Array #Math #Sorting #Enumeration #Geometry #Segment_Tree #Binary_Indexed_Tree
// #2024_12_10_Time_8_ms_(81.05%)_Space_45_MB_(66.32%)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maxRectangleArea(int[][] points) {
        Set<String> set = new HashSet<>();
        for (int[] p : points) {
            set.add(Arrays.toString(p));
        }
        int maxArea = -1;
        for (int[] point : points) {
            for (int j = 1; j < points.length; j++) {
                int[] p2 = points[j];
                if (point[0] == p2[0]
                        || point[1] == p2[1]
                        || !set.contains(Arrays.toString(new int[] {point[0], p2[1]}))
                        || !set.contains(Arrays.toString(new int[] {p2[0], point[1]}))
                        || !validate(points, point, p2)) {
                    continue;
                }
                maxArea = Math.max(maxArea, (p2[1] - point[1]) * (p2[0] - point[0]));
            }
        }
        return maxArea;
    }

    private boolean validate(int[][] points, int[] p1, int[] p2) {
        int top = Math.max(p1[1], p2[1]);
        int bot = Math.min(p1[1], p2[1]);
        int left = Math.min(p1[0], p2[0]);
        int right = Math.max(p1[0], p2[0]);
        for (int[] p : points) {
            int x = p[0];
            int y = p[1];
            if ((y == top || y == bot) && x > left && x < right
                    || (x == left || x == right) && y > bot && y < top
                    || (x > left && x < right && y > bot && y < top)) {
                return false;
            }
        }
        return true;
    }
}
