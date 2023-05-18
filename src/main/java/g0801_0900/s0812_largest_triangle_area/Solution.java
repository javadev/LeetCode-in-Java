package g0801_0900.s0812_largest_triangle_area;

// #Easy #Array #Math #Geometry #2022_03_23_Time_5_ms_(92.04%)_Space_39.8_MB_(87.61%)

public class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area;
                    int[] a = points[i];
                    int[] b = points[j];
                    int[] c = points[k];
                    area = Math.abs(area(a, b) + area(b, c) + area(c, a));
                    if (area > max) {
                        max = area;
                    }
                }
            }
        }
        return max;
    }

    private double area(int[] a, int[] b) {
        int l = b[0] - a[0];
        double h = (a[1] + b[1] + 200) / 2.0;
        return l * h;
    }
}
