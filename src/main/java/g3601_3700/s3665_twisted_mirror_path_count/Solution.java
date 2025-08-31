package g3601_3700.s3665_twisted_mirror_path_count;

// #Medium #Biweekly_Contest_164 #2025_08_31_Time_204_ms_(100.00%)_Space_86.33_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    private static final int MOD = 1000000007;

    public int uniquePaths(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return f(0, 0, 0, grid, n, m, dp);
    }

    private int f(int i, int j, int dir, int[][] grid, int n, int m, int[][][] dp) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i >= n || j >= m) {
            return 0;
        }
        if (dp[i][j][dir] != -1) {
            return dp[i][j][dir];
        }
        long ways = 0;
        if (grid[i][j] == 1) {
            if (dir == 0) {
                ways = f(i + 1, j, 1, grid, n, m, dp);
            } else {
                ways = f(i, j + 1, 0, grid, n, m, dp);
            }
        } else {
            ways += f(i + 1, j, 1, grid, n, m, dp);
            ways += f(i, j + 1, 0, grid, n, m, dp);
        }
        return dp[i][j][dir] = (int) ways % MOD;
    }
}
