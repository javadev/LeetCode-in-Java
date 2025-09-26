package g3601_3700.s3651_minimum_cost_path_with_teleportations;

// #Hard #Array #Dynamic_Programming #Matrix #Biweekly_Contest_163
// #2025_09_26_Time_79_ms_(94.66%)_Space_45.38_MB_(97.96%)

import java.util.Arrays;

public class Solution {
    public int minCost(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int max = -1;
        int[][] dp = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                max = Math.max(grid[i][j], max);
                if (i == n - 1 && j == m - 1) {
                    continue;
                }
                if (i == n - 1) {
                    dp[i][j] = grid[i][j + 1] + dp[i][j + 1];
                } else if (j == m - 1) {
                    dp[i][j] = grid[i + 1][j] + dp[i + 1][j];
                } else {
                    dp[i][j] =
                            Math.min(grid[i + 1][j] + dp[i + 1][j], grid[i][j + 1] + dp[i][j + 1]);
                }
            }
        }
        int[] prev = new int[max + 1];
        Arrays.fill(prev, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                prev[grid[i][j]] = Math.min(prev[grid[i][j]], dp[i][j]);
            }
        }
        // int currcost = prev[0];
        for (int i = 1; i <= max; i++) {
            prev[i] = Math.min(prev[i], prev[i - 1]);
        }
        for (int tr = 1; tr <= k; tr++) {
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    if (i == n - 1 && j == m - 1) {
                        continue;
                    }
                    dp[i][j] = prev[grid[i][j]];
                    if (i == n - 1) {
                        dp[i][j] = Math.min(dp[i][j], grid[i][j + 1] + dp[i][j + 1]);
                    } else if (j == m - 1) {
                        dp[i][j] = Math.min(dp[i][j], grid[i + 1][j] + dp[i + 1][j]);
                    } else {
                        dp[i][j] = Math.min(dp[i][j], grid[i + 1][j] + dp[i + 1][j]);
                        dp[i][j] = Math.min(dp[i][j], grid[i][j + 1] + dp[i][j + 1]);
                    }
                }
            }
            Arrays.fill(prev, Integer.MAX_VALUE);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    prev[grid[i][j]] = Math.min(prev[grid[i][j]], dp[i][j]);
                }
            }
            for (int i = 1; i <= max; i++) {
                prev[i] = Math.min(prev[i], prev[i - 1]);
            }
        }
        return dp[0][0];
    }
}
