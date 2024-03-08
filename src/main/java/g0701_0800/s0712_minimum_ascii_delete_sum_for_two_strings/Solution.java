package g0701_0800.s0712_minimum_ascii_delete_sum_for_two_strings;

// #Medium #String #Dynamic_Programming #2022_03_24_Time_18_ms_(91.28%)_Space_47.8_MB_(62.21%)

public class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        char c1;
        char c2;
        for (int i = 1; i < len1 + 1; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int j = 1; j < len2 + 1; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }
        for (int i = 1; i < len1 + 1; i++) {
            c1 = s1.charAt(i - 1);
            for (int j = 1; j < len2 + 1; j++) {
                c2 = s2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + c1, dp[i][j - 1] + c2);
                }
            }
        }
        return dp[len1][len2];
    }
}
