package g1301_1400.s1312_minimum_insertion_steps_to_make_a_string_palindrome;

// #Hard #String #Dynamic_Programming #2022_03_15_Time_25_ms_(85.70%)_Space_43.5_MB_(88.66%)

public class Solution {
    private int longestPalindrome(String a, String b, int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][n];
    }

    public int minInsertions(String s) {
        int n = s.length();
        if (n < 2) {
            return 0;
        }
        String rs = new StringBuilder(s).reverse().toString();
        int l = longestPalindrome(s, rs, n);
        return n - l;
    }
}
