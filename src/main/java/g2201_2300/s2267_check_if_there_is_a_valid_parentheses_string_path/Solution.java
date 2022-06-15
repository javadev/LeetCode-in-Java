package g2201_2300.s2267_check_if_there_is_a_valid_parentheses_string_path;

// #2022_06_15_Time_93_ms_(77.48%)_Space_128.2_MB_(27.18%)

public class Solution {
    private char[][] grid;
    private int m;
    private int n;
    public static final char LFTPAR = '(';
    public static final char RGTPAR = ')';

    public boolean hasValidPath(char[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        Boolean[][][] dp = new Boolean[m][n][m + n + 1];

        if (grid[0][0] == RGTPAR) {
            return false;
        }
        if (grid[m - 1][n - 1] == LFTPAR) {
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
            return dp[u][v][open - close] = dfs(u, v + 1, open, close, dp);
        }
        if (v == n - 1) {
            return dfs(u + 1, v, open, close, dp);
        }

        boolean rslt = false;
        if (grid[u][v] == LFTPAR) {
            rslt = dfs(u + 1, v, open, close, dp) || dfs(u, v + 1, open, close, dp);
        } else {
            rslt = dfs(u, v + 1, open, close, dp) || dfs(u + 1, v, open, close, dp);
        }
        dp[u][v][open - close] = rslt;
        return rslt;
    }
}
