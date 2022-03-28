package g1401_1500.s1444_number_of_ways_of_cutting_a_pizza;

// #Hard #Array #Dynamic_Programming #Matrix #Memoization
// #2022_03_28_Time_14_ms_(46.03%)_Space_41.8_MB_(65.08%)

@SuppressWarnings("java:S2234")
public class Solution {
    private static final int K_MOD = (int) (1e9 + 7);

    public int ways(String[] pizza, int k) {
        if (pizza == null || pizza.length == 0) {
            return 0;
        }
        int m = pizza.length;
        int n = pizza[0].length();
        int[][] prefix = new int[m + 1][n + 1];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                prefix[i + 1][j + 1] =
                        prefix[i][j + 1]
                                + prefix[i + 1][j]
                                + (pizza[i].charAt(j) == 'A' ? 1 : 0)
                                - prefix[i][j];
            }
        }
        int[][][] dp = new int[m][n][k];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int s = 0; s < k; ++s) {
                    dp[i][j][s] = -1;
                }
            }
        }
        return dfs(0, 0, m, n, k - 1, prefix, dp);
    }

    private int dfs(int m, int n, int temp1, int temp2, int k, int[][] prefix, int[][][] dp) {
        if (k == 0) {
            return hasApple(prefix, m, n, temp1 - 1, temp2 - 1) ? 1 : 0;
        }
        if (dp[m][n][k] != -1) {
            return dp[m][n][k];
        }
        int local = 0;
        for (int x = m; x < temp1 - 1; ++x) {
            local =
                    (local
                                    + (hasApple(prefix, m, n, x, temp2 - 1) ? 1 : 0)
                                            * dfs(x + 1, n, temp1, temp2, k - 1, prefix, dp))
                            % K_MOD;
        }
        for (int y = n; y < temp2 - 1; ++y) {
            local =
                    (local
                                    + (hasApple(prefix, m, n, temp1 - 1, y) ? 1 : 0)
                                            * dfs(m, y + 1, temp1, temp2, k - 1, prefix, dp))
                            % K_MOD;
        }
        dp[m][n][k] = local;
        return dp[m][n][k];
    }

    private boolean hasApple(int[][] prefix, int x1, int y1, int x2, int y2) {
        return (prefix[x2 + 1][y2 + 1] - prefix[x1][y2 + 1] - prefix[x2 + 1][y1] + prefix[x1][y1])
                > 0;
    }
}
