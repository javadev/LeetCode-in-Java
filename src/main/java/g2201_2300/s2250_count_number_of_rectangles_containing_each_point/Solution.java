package g2201_2300.s2250_count_number_of_rectangles_containing_each_point;

// #Medium #Array #Sorting #Binary_Search #Binary_Indexed_Tree
// #2022_06_13_Time_49_ms_(98.80%)_Space_71.8_MB_(79.17%)

import java.util.Arrays;

public class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        int n = rectangles.length;
        int q = points.length;
        int[][] es = new int[n + q][];
        System.arraycopy(rectangles, 0, es, 0, n);
        for (int i = 0; i < q; i++) {
            es[n + i] = new int[] {points[i][0], points[i][1], i};
        }
        Arrays.sort(es, (x, y) -> x[0] != y[0] ? -(x[0] - y[0]) : x.length - y.length);
        int[] ct = new int[101];
        int[] ans = new int[q];
        for (int[] e : es) {
            if (e.length == 2) {
                for (int i = 0; i <= e[1]; i++) {
                    ct[i]++;
                }
            } else {
                ans[e[2]] = ct[e[1]];
            }
        }
        return ans;
    }
}
