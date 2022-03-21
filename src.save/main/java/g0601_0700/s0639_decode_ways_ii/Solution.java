package g0601_0700.s0639_decode_ways_ii;

// #Hard #String #Dynamic_Programming #2022_03_21_Time_22_ms_(93.12%)_Space_59.1_MB_(71.99%)

public class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        long[] dp = new long[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '*' ? 9 : 1;
        char[] ch = s.toCharArray();

        for (int i = 2; i <= ch.length; i++) {
            if (ch[i - 1] == '0') {
                if (ch[i - 2] == '1' || ch[i - 2] == '2') {
                    dp[i] = dp[i - 2];
                } else if (ch[i - 2] == '*') {
                    dp[i] = 2 * dp[i - 2];
                } else {
                    return 0;
                }
            } else if (ch[i - 1] >= '1' && ch[i - 1] <= '6') {
                dp[i] = dp[i - 1];
                if (ch[i - 2] == '1' || ch[i - 2] == '2') {
                    dp[i] += dp[i - 2];
                } else if (ch[i - 2] == '*') {
                    dp[i] += 2 * dp[i - 2];
                }
            } else if (ch[i - 1] >= '7' && ch[i - 1] <= '9') {
                dp[i] = dp[i - 1];
                if (ch[i - 2] == '1' || ch[i - 2] == '*') {
                    dp[i] += dp[i - 2];
                }
            } else if (ch[i - 1] == '*') {
                dp[i] = 9 * dp[i - 1];
                if (ch[i - 2] == '1') {
                    dp[i] += 9 * dp[i - 2];
                } else if (ch[i - 2] == '2') {
                    dp[i] += 6 * dp[i - 2];
                } else if (ch[i - 2] == '*') {
                    dp[i] += 15 * dp[i - 2];
                }
            }
            dp[i] %= 1000000007;
        }

        return (int) dp[s.length()];
    }
}
