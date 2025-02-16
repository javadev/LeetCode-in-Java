package g3401_3500.s3459_length_of_longest_v_shaped_diagonal_segment;

// #Hard #2025_02_16_Time_484_ms_(100.00%)_Space_139.26_MB_(_%)

import java.util.Arrays;

public class Solution {
    private final int[][] ds = {{1, 1}, {1, -1}, {-1, -1}, {-1, 1}};
    private final int[] nx = {2, 2, 0};
    private int[][] grid;
    private int n;
    private int m;
    private int[][][][] dp;

    public int lenOfVDiagonal(int[][] g) {
        this.grid = g;
        this.n = g.length;
        this.m = g[0].length;
        this.dp = new int[n][m][4][2];
        for (int[][][] d1 : dp) {
            for (int[][] d2 : d1) {
                for (int[] d3 : d2) {
                    Arrays.fill(d3, -1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 1) {
                    for (int d = 0; d < 4; d++) {
                        res = Math.max(res, dp(i, j, 1, d, 1));
                    }
                }
            }
        }
        return res;
    }

    private int dp(int i, int j, int x, int d, int k) {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return 0;
        }
        if (grid[i][j] != x) {
            return 0;
        }
        if (dp[i][j][d][k] != -1) {
            return dp[i][j][d][k];
        }
        int res = dp(i + ds[d][0], j + ds[d][1], nx[x], d, k) + 1;
        if (k > 0) {
            int d2 = (d + 1) % 4;
            int res2 = dp(i + ds[d2][0], j + ds[d2][1], nx[x], d2, 0) + 1;
            res = Math.max(res, res2);
        }
        dp[i][j][d][k] = res;
        return res;
    }
}
