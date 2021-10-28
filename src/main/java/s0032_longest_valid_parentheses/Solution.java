package s0032_longest_valid_parentheses;

public class Solution {
    public int longestValidParentheses(String symbols) {
        int max = 0;
        char[] s = symbols.toCharArray();
        int[] dp = new int[s.length];

        for (int i = 1; i < s.length; i++) {
            if (s[i] == ')') {
                if (s[i - 1] == '(') {
                    dp[i] = 2;
                    dp[i] += (i >= 2) ? dp[i - 2] : 0;
                } else {
                    if (i - dp[i - 1] - 1 >= 0 && s[i - dp[i - 1] - 1] == '(') {
                        dp[i] = 2;
                        dp[i] += dp[i - 1];
                        dp[i] += ((i - dp[i - 1]) >= 2) ? dp[i - dp[i - 1] - 2] : 0;
                    }
                }

                max = Math.max(max, dp[i]);
            }
        }

        return max;
    }
}
