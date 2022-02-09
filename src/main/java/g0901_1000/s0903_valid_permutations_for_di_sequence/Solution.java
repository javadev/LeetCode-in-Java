package g0901_1000.s0903_valid_permutations_for_di_sequence;

// #Hard #Dynamic_Programming

public class Solution {
    public int numPermsDISequence(String S) {
        int n = S.length();
        int mod = (int) 1e9 + 7;
        int[][] dp = new int[n + 1][n + 1];
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'I') {
                for (int j = 0, cur = 0; j < n - i; j++) {
                    dp[i + 1][j] = cur = (cur + dp[i][j]) % mod;
                }
            } else {
                for (int j = n - i - 1, cur = 0; j >= 0; j--) {
                    dp[i + 1][j] = cur = (cur + dp[i][j + 1]) % mod;
                }
            }
        }
        return dp[n][0];
    }
}
