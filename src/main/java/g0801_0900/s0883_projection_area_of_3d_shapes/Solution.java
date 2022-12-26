package g0801_0900.s0883_projection_area_of_3d_shapes;

// #Easy #Array #Math #Matrix #Geometry #2022_03_28_Time_1_ms_(100.00%)_Space_44.8_MB_(37.40%)

public class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int sum = n * m;
        int count = 0;
        for (int[] ints : grid) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if (ints[j] == 0) {
                    count++;
                }
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
            sum += max;
        }
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if (max < grid[j][i]) {
                    max = grid[j][i];
                }
            }
            sum += max;
        }
        return sum - count;
    }
}
