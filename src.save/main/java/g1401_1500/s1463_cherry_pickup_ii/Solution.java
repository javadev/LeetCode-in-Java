package g1401_1500.s1463_cherry_pickup_ii;

// #Hard #Array #Dynamic_Programming #Matrix #2022_03_29_Time_10_ms_(99.58%)_Space_43.1_MB_(83.50%)

public class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[n][n][m];
        dp[0][n - 1][0] = grid[0][0] + grid[0][n - 1];
        for (int k = 1; k < m; k++) {
            for (int i = 0; i <= Math.min(n - 1, k); i++) {
                for (int j = n - 1; j >= Math.max(0, n - 1 - k); j--) {
                    dp[i][j][k] = maxOfLast(dp, i, j, k) + grid[k][i] + ((i == j) ? 0 : grid[k][j]);
                }
            }
        }
        int result = 0;
        for (int i = 0; i <= Math.min(n - 1, m); i++) {
            for (int j = n - 1; j >= Math.max(0, n - 1 - m); j--) {
                result = Math.max(result, dp[i][j][m - 1]);
            }
        }
        return result;
    }

    private int maxOfLast(int[][][] dp, int i, int j, int k) {
        int result = 0;
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                int r = i + x;
                int c = j + y;
                if (r >= 0 && r < dp[0].length && c >= 0 && c < dp[0].length) {
                    result = Math.max(result, dp[r][c][k - 1]);
                }
            }
        }
        return result;
    }
}
