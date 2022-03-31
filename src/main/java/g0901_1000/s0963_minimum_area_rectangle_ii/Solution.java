package g0901_1000.s0963_minimum_area_rectangle_ii;

// #Medium #Array #Math #Geometry #2022_03_31_Time_12_ms_(92.95%)_Space_43.1_MB_(83.55%)

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("java:S135")
public class Solution {
    public double minAreaFreeRect(int[][] points) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        double area;
        for (int[] point : points) {
            map.putIfAbsent(point[0], new HashSet<>());
            map.get(point[0]).add(point[1]);
        }
        double minArea = Double.MAX_VALUE;
        int n = points.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int dx1 = points[j][0] - points[i][0];
                int dy1 = points[j][1] - points[i][1];
                // get the 3rd point
                for (int k = j + 1; k < n; k++) {
                    int dx2 = points[k][0] - points[i][0];
                    int dy2 = points[k][1] - points[i][1];
                    if (dx1 * dx2 + dy1 * dy2 != 0) {
                        continue;
                    }
                    // find the 4th point
                    int x = dx1 + points[k][0];
                    int y = dy1 + points[k][1];
                    area = calculateArea(points, i, j, k);
                    if (area >= minArea) {
                        continue;
                    }
                    // 4th point exists
                    if (map.get(x) != null && map.get(x).contains(y)) {
                        minArea = area;
                    }
                }
            }
        }
        return minArea == Double.MAX_VALUE ? 0.0 : minArea;
    }

    private double calculateArea(int[][] points, int i, int j, int k) {
        int[] first = points[i];
        int[] second = points[j];
        int[] third = points[k];
        return Math.abs(
                first[0] * (second[1] - third[1])
                        + second[0] * (third[1] - first[1])
                        + third[0] * (first[1] - second[1]));
    }
}
