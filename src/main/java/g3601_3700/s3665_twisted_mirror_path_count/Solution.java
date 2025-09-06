package g3601_3700.s3665_twisted_mirror_path_count;

// #Medium #Biweekly_Contest_164 #2025_09_06_Time_28_ms_(100.00%)_Space_86.70_MB_(69.78%)

public class Solution {
    public int uniquePaths(int[][] grid) {
        // 0 right, 1 down
        int n = grid.length;
        int m = grid[0].length;
        int mod = 1_000_000_007;
        int[] dp = new int[m];
        dp[0] = 1;
        for (int j = 1; j < m; j++) {
            if (grid[0][j - 1] == 0) {
                dp[j] = dp[j - 1];
            }
        }
        for (int i = 1; i < n; i++) {
            int[] next = new int[m];
            if (grid[i - 1][0] == 0 && grid[i][0] == 0) {
                next[0] = dp[0];
            }
            for (int j = 1; j < m; j++) {
                if (grid[i][j] == 0) {
                    next[j] = (next[j] + dp[j]) % mod;
                }
                if (grid[i][j - 1] == 0) {
                    next[j] = (next[j] + next[j - 1]) % mod;
                } else {
                    next[j] = (next[j] + dp[j - 1]) % mod;
                }
            }
            dp = next;
        }
        return dp[m - 1];
    }
}
