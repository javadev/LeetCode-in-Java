package g1701_1800.s1771_maximize_palindrome_length_from_subsequences;

// #Hard #String #Dynamic_Programming #2022_04_30_Time_58_ms_(87.88%)_Space_67.1_MB_(92.42%)

public class Solution {
    public int longestPalindrome(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int len = len1 + len2;
        String word = word1 + word2;
        int[][] dp = new int[len][len];
        int max = 0;
        char[] arr = word.toCharArray();
        for (int d = 1; d <= len; d++) {
            for (int i = 0; i + d - 1 < len; i++) {
                if (arr[i] == arr[i + d - 1]) {
                    dp[i][i + d - 1] =
                            d == 1 ? 1 : Math.max(dp[i + 1][i + d - 2] + 2, dp[i][i + d - 1]);
                    if (i < len1 && i + d - 1 >= len1) {
                        max = Math.max(max, dp[i][i + d - 1]);
                    }
                } else {
                    dp[i][i + d - 1] = Math.max(dp[i + 1][i + d - 1], dp[i][i + d - 2]);
                }
            }
        }
        return max;
    }
}
