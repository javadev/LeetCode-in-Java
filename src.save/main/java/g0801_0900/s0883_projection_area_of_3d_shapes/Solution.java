package g0801_0900.s0883_projection_area_of_3d_shapes;

// #Easy #Array #Math #Matrix #Geometry

public class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int sum = n * m;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    count++;
                }
                if (max < grid[i][j]) {
                    max = grid[i][j];
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
