package g0601_0700.s0664_strange_printer;

// #Hard #String #Dynamic_Programming #2022_03_22_Time_24_ms_(76.35%)_Space_42_MB_(87.89%)

public class Solution {
    public int strangePrinter(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(i + 1)) {
                    dp[i][j] = dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j] + 1;
                    for (int k = i + 1; k <= j; k++) {
                        if (s.charAt(k) == s.charAt(i)) {
                            dp[i][j] = Math.min(dp[i][j], dp[i + 1][k - 1] + dp[k][j]);
                        }
                    }
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}
