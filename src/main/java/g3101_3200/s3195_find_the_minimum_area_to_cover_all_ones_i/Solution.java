package g3101_3200.s3195_find_the_minimum_area_to_cover_all_ones_i;

// #Medium #Array #Matrix #2024_06_26_Time_5_ms_(94.40%)_Space_197.2_MB_(14.87%)

public class Solution {
    public int minimumArea(int[][] grid) {
        int xmin = Integer.MAX_VALUE;
        int xmax = -1;
        int ymin = Integer.MAX_VALUE;
        int ymax = -1;
        for (int i = 0, m = grid.length, n = grid[0].length; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    xmin = Math.min(xmin, i);
                    xmax = Math.max(xmax, i);
                    ymin = Math.min(ymin, j);
                    ymax = Math.max(ymax, j);
                }
            }
        }
        return (xmax - xmin + 1) * (ymax - ymin + 1);
    }
}
