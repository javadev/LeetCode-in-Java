package g3401_3500.s3472_longest_palindromic_subsequence_after_at_most_k_operations;

// #Medium #String #Dynamic_Programming #2025_03_06_Time_153_ms_(85.01%)_Space_87.68_MB_(54.23%)

public class Solution {
    public int longestPalindromicSubsequence(String s, int k) {
        int n = s.length();
        int[][] arr = new int[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                arr[i][j] = Math.min(Math.abs(i - j), 26 - Math.abs(i - j));
            }
        }
        int[][][] dp = new int[n][n][k + 1];
        for (int i = 0; i < n; i++) {
            for (int it = 0; it <= k; it++) {
                dp[i][i][it] = 1;
            }
        }
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                for (int it = 0; it <= k; it++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j][it] = 2 + dp[i + 1][j - 1][it];
                    } else {
                        int num1 = dp[i + 1][j][it];
                        int num2 = dp[i][j - 1][it];
                        int c = arr[s.charAt(i) - 'a'][s.charAt(j) - 'a'];
                        int num3 = (it >= c) ? 2 + dp[i + 1][j - 1][it - c] : 0;
                        dp[i][j][it] = Math.max(Math.max(num1, num2), num3);
                    }
                }
            }
        }
        return dp[0][n - 1][k];
    }
}
