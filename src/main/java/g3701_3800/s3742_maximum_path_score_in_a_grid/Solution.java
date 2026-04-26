package g3701_3800.s3742_maximum_path_score_in_a_grid;

// #Medium #Array #Dynamic_Programming #Matrix #Staff #Weekly_Contest_475
// #2026_04_26_Time_212_ms_(91.38%)_Space_92.93_MB_(35.06%)

public class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int mxc = Math.min(k + 1, n + m + 5);
        int[][][] dp = new int[n][m][mxc];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int c = 0; c < mxc; c++) {
                    dp[i][j][c] = -1;
                }
            }
        }
        dp[0][0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int c = 0; c < mxc; c++) {
                    if (dp[i][j][c] == -1) {
                        continue;
                    }
                    // move right
                    if (j + 1 < m) {
                        int cost = c + (grid[i][j + 1] > 0 ? 1 : 0);
                        if (cost < mxc) {
                            dp[i][j + 1][cost] =
                                    Math.max(dp[i][j + 1][cost], dp[i][j][c] + grid[i][j + 1]);
                        }
                    }
                    // move down
                    if (i + 1 < n) {
                        int cost = c + (grid[i + 1][j] > 0 ? 1 : 0);
                        if (cost < mxc) {
                            dp[i + 1][j][cost] =
                                    Math.max(dp[i + 1][j][cost], dp[i][j][c] + grid[i + 1][j]);
                        }
                    }
                }
            }
        }
        int ans = -1;
        for (int c = 0; c < mxc; c++) {
            ans = Math.max(ans, dp[n - 1][m - 1][c]);
        }
        return ans;
    }
}
