package g1501_1600.s1594_maximum_non_negative_product_in_a_matrix;

// #Medium #Array #Dynamic_Programming #Matrix
// #2022_04_06_Time_1_ms_(100.00%)_Space_41.7_MB_(89.38%)

public class Solution {
    private static class Tuple {
        long max;
        long min;

        public Tuple(long a, long b) {
            this.max = a;
            this.min = b;
        }
    }

    public int maxProductPath(int[][] grid) {
        // DP
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        Tuple[][] dp = new Tuple[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dp[i][j] = new Tuple(1, 1);
            }
        }
        // Init first row and column
        dp[0][0].max = grid[0][0];
        dp[0][0].min = grid[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0].max = grid[i][0] * dp[i - 1][0].max;
            dp[i][0].min = grid[i][0] * dp[i - 1][0].min;
        }
        for (int i = 1; i < cols; i++) {
            dp[0][i].max = grid[0][i] * dp[0][i - 1].max;
            dp[0][i].min = grid[0][i] * dp[0][i - 1].min;
        }
        // DP
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                long up1 = dp[i - 1][j].max * grid[i][j];
                long up2 = dp[i - 1][j].min * grid[i][j];
                long left1 = dp[i][j - 1].max * grid[i][j];
                long left2 = dp[i][j - 1].min * grid[i][j];
                // max(up1, up2, left1, left2)
                dp[i][j].max = Math.max(up1, Math.max(up2, Math.max(left1, left2)));
                // min(up1, up2, left1, left2)
                dp[i][j].min = Math.min(up1, Math.min(up2, Math.min(left1, left2)));
            }
        }
        if (dp[rows - 1][cols - 1].max < 0) {
            return -1;
        }
        return (int) (dp[rows - 1][cols - 1].max % (1e9 + 7));
    }
}
