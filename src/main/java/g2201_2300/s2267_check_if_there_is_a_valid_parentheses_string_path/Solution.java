package g2201_2300.s2267_check_if_there_is_a_valid_parentheses_string_path;

// #Hard #Array #Dynamic_Programming #Matrix #2022_06_15_Time_93_ms_(77.48%)_Space_128.2_MB_(27.18%)

public class Solution {
    private char[][] grid;
    private int m;
    private int n;
    private static final char LFTPAR = '(';
    private static final char RGTPAR = ')';

    public boolean hasValidPath(char[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        Boolean[][][] dp = new Boolean[m][n][m + n + 1];
        if (grid[0][0] == RGTPAR) {
            return false;
        }
        if ((m + n) % 2 == 0) {
            return false;
        }
        return dfs(0, 0, 0, 0, dp);
    }

    private boolean dfs(int u, int v, int open, int close, Boolean[][][] dp) {
        if (grid[u][v] == LFTPAR) {
            open++;
        } else {
            close++;
        }
        if (u == m - 1 && v == n - 1) {
            return open == close;
        }
        if (open < close) {
            return false;
        }
        if (dp[u][v][open - close] != null) {
            return dp[u][v][open - close];
        }
        if (u == m - 1) {
            boolean result = dfs(u, v + 1, open, close, dp);
            dp[u][v][open - close] = result;
            return result;
        }
        if (v == n - 1) {
            return dfs(u + 1, v, open, close, dp);
        }
        boolean rslt;
        if (grid[u][v] == LFTPAR) {
            rslt = dfs(u + 1, v, open, close, dp) || dfs(u, v + 1, open, close, dp);
        } else {
            rslt = dfs(u, v + 1, open, close, dp) || dfs(u + 1, v, open, close, dp);
        }
        dp[u][v][open - close] = rslt;
        return rslt;
    }
}
