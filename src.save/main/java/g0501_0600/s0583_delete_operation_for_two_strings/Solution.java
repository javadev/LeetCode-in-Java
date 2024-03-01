package g0501_0600.s0583_delete_operation_for_two_strings;

// #Medium #String #Dynamic_Programming #Algorithm_II_Day_17_Dynamic_Programming
// #2022_08_10_Time_12_ms_(79.10%)_Space_47.4_MB_(14.02%)

public class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] =
                        word1.charAt(i - 1) == word2.charAt(j - 1)
                                ? dp[i - 1][j - 1] + 1
                                : Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return m + n - 2 * dp[m][n];
    }
}
