package s0005_longest_palindromic_substring;

public class Solution {
    public String longestPalindrome(String s) {
        char[] newStr = new char[s.length() * 2 + 1];
        newStr[0] = '#';
        for (int i = 0; i < s.length(); i++) {
            newStr[2 * i + 1] = s.charAt(i);
            newStr[2 * i + 2] = '#';
        }
        int[] dp = new int[newStr.length];
        int friendCenter = 0;
        int friendRadius = 0;
        int lpsCenter = 0;
        int lpsRadius = 0;
        for (int i = 0; i < newStr.length; i++) {
            dp[i] =
                    friendCenter + friendRadius > i
                            ? Math.min(dp[friendCenter * 2 - i], (friendCenter + friendRadius) - i)
                            : 1;
            while (i + dp[i] < newStr.length
                    && i - dp[i] >= 0
                    && newStr[i + dp[i]] == newStr[i - dp[i]]) {
                dp[i]++;
            }
            if (friendCenter + friendRadius < i + dp[i]) {
                friendCenter = i;
                friendRadius = dp[i];
            }
            if (lpsRadius < dp[i]) {
                lpsCenter = i;
                lpsRadius = dp[i];
            }
        }
        return s.substring((lpsCenter - lpsRadius + 1) / 2, (lpsCenter + lpsRadius - 1) / 2);
    }
}
