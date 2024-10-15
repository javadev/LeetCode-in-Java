package g3301_3400.s3320_count_the_number_of_winning_sequences;

// #Hard #String #Dynamic_Programming #2024_10_15_Time_43_ms_(99.76%)_Space_74.6_MB_(88.56%)

public class Solution {
    private static final int MOD = (int) 1e9 + 7;

    public int countWinningSequences(String s) {
        int n = s.length();
        int[][][] dp = new int[n][3][2 * n + 1];
        if (s.charAt(0) == 'F') {
            dp[0][0][n] = 1;
            dp[0][1][1 + n] = 1;
            dp[0][2][-1 + n] = 1;
        } else if (s.charAt(0) == 'W') {
            dp[0][0][-1 + n] = 1;
            dp[0][1][n] = 1;
            dp[0][2][1 + n] = 1;
        } else if (s.charAt(0) == 'E') {
            dp[0][0][1 + n] = 1;
            dp[0][1][-1 + n] = 1;
            dp[0][2][n] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'F') {
                for (int j = 0; j < 2 * n + 1; j++) {
                    dp[i][0][j] = (dp[i - 1][1][j] + dp[i - 1][2][j]) % MOD;
                }
                for (int j = 1; j < 2 * n + 1; j++) {
                    dp[i][1][j] = (dp[i - 1][0][j - 1] + dp[i - 1][2][j - 1]) % MOD;
                }
                for (int j = 0; j < 2 * n; j++) {
                    dp[i][2][j] = (dp[i - 1][0][j + 1] + dp[i - 1][1][j + 1]) % MOD;
                }
            } else if (s.charAt(i) == 'W') {
                for (int j = 0; j < 2 * n + 1; j++) {
                    dp[i][1][j] = (dp[i - 1][0][j] + dp[i - 1][2][j]) % MOD;
                }
                for (int j = 1; j < 2 * n + 1; j++) {
                    dp[i][2][j] = (dp[i - 1][0][j - 1] + dp[i - 1][1][j - 1]) % MOD;
                }
                for (int j = 0; j < 2 * n; j++) {
                    dp[i][0][j] = (dp[i - 1][1][j + 1] + dp[i - 1][2][j + 1]) % MOD;
                }
            } else if (s.charAt(i) == 'E') {
                for (int j = 0; j < 2 * n; j++) {
                    dp[i][2][j] = (dp[i - 1][0][j] + dp[i - 1][1][j]) % MOD;
                }
                for (int j = 1; j < 2 * n + 1; j++) {
                    dp[i][0][j] = (dp[i - 1][1][j - 1] + dp[i - 1][2][j - 1]) % MOD;
                }
                for (int j = 0; j < 2 * n; j++) {
                    dp[i][1][j] = (dp[i - 1][0][j + 1] + dp[i - 1][2][j + 1]) % MOD;
                }
            }
        }
        int count = 0;
        for (int j = n + 1; j < 2 * n + 1; j++) {
            count = (count + dp[n - 1][0][j]) % MOD;
            count = (count + dp[n - 1][1][j]) % MOD;
            count = (count + dp[n - 1][2][j]) % MOD;
        }
        return count % MOD;
    }
}
