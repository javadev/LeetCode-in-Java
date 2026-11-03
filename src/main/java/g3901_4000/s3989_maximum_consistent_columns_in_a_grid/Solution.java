package g3901_4000.s3989_maximum_consistent_columns_in_a_grid;

// #Hard #Array #Dynamic_Programming #Matrix #Senior_Staff #Weekly_Contest_510
// #2026_11_03_Time_10_ms_(94.64%)_Space_61.08_MB_(87.50%)

public class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int n = grid[0].length;
        int max = 1;
        int[] dp = new int[n];
        for (int col = 0; col < n; ++col) {
            dp[col] = 1;
            for (int p = col - 1; p >= 0; --p) {
                if (dp[p] + 1 >= dp[col] && areColumnsConsistent(grid, col, p, limit)) {
                    dp[col] = dp[p] + 1;
                }
            }
            max = Math.max(max, dp[col]);
        }
        return max;
    }

    private boolean areColumnsConsistent(int[][] grid, int col, int previousCol, int limit) {
        for (int[] row : grid) {
            if (Math.abs(row[col] - row[previousCol]) > limit) {
                return false;
            }
        }
        return true;
    }
}
