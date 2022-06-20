package g2301_2400.s2312_selling_pieces_of_wood;

// #Hard #Backtracking #2022_06_20_Time_78_ms_(63.64%)_Space_53.1_MB_(63.64%)

public class Solution {
    public long sellingWood(int m, int n, int[][] prices) {
        // dp[i][j] = Maximum profit selling wood of size i*j
        long[][] dp = new long[m][n];
        for (int[] price : prices) {
            dp[price[0] - 1][price[1] - 1] = Math.max(dp[price[0] - 1][price[1] - 1], price[2]);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Cut Vertically
                for (int k = 0; k < j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[i][j - k - 1]);
                }
                // Cut Horizontally
                for (int k = 0; k < i; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[k][j] + dp[i - k - 1][j]);
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
