package g3301_3400.s3393_count_paths_with_the_given_xor_value;

// #Medium #2024_12_22_Time_83_ms_(100.00%)_Space_57_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    private final int mod = (int) (1e9 + 7);
    private int m = -1;
    private int n = -1;
    private int[][][] dp;

    public int countPathsWithXorValue(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;
        dp = new int[m][n][16];
        for (int[][] a : dp) {
            for (int[] b : a) {
                Arrays.fill(b, -1);
            }
        }
        return dfs(grid, 0, k, 0, 0);
    }

    private int dfs(int[][] grid, int xorVal, int k, int i, int j) {
        if (i < 0 || j < 0 || j >= n || i >= m) {
            return 0;
        }
        xorVal ^= grid[i][j];
        if (dp[i][j][xorVal] != -1) {
            return dp[i][j][xorVal];
        }
        if (i == m - 1 && j == n - 1 && xorVal == k) {
            return 1;
        }
        int down = dfs(grid, xorVal, k, i + 1, j);
        int right = dfs(grid, xorVal, k, i, j + 1);
        dp[i][j][xorVal] = (down + right) % mod;
        return dp[i][j][xorVal];
    }
}
