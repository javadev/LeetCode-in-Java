package g3401_3500.s3418_maximum_amount_of_money_robot_can_earn;

// #Medium #Array #Dynamic_Programming #Matrix
// #2025_01_15_Time_12_ms_(99.86%)_Space_72.43_MB_(98.47%)

public class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        int[][] dp = new int[m][n];
        int[][] dp1 = new int[m][n];
        int[][] dp2 = new int[m][n];
        dp[0][0] = coins[0][0];
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + coins[0][j];
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + coins[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) + coins[i][j];
            }
        }
        dp1[0][0] = Math.max(coins[0][0], 0);
        for (int j = 1; j < n; j++) {
            dp1[0][j] = Math.max(dp[0][j - 1], dp1[0][j - 1] + coins[0][j]);
        }
        for (int i = 1; i < m; i++) {
            dp1[i][0] = Math.max(dp[i - 1][0], dp1[i - 1][0] + coins[i][0]);
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp1[i][j] =
                        Math.max(
                                Math.max(dp[i][j - 1], dp[i - 1][j]),
                                Math.max(dp1[i][j - 1], dp1[i - 1][j]) + coins[i][j]);
            }
        }
        dp2[0][0] = Math.max(coins[0][0], 0);
        for (int j = 1; j < n; j++) {
            dp2[0][j] = Math.max(dp1[0][j - 1], dp2[0][j - 1] + coins[0][j]);
        }
        for (int i = 1; i < m; i++) {
            dp2[i][0] = Math.max(dp1[i - 1][0], dp2[i - 1][0] + coins[i][0]);
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp2[i][j] =
                        Math.max(
                                Math.max(dp1[i][j - 1], dp1[i - 1][j]),
                                Math.max(dp2[i][j - 1], dp2[i - 1][j]) + coins[i][j]);
            }
        }
        return dp2[m - 1][n - 1];
    }
}
