package g1401_1500.s1416_restore_the_array;

// #Hard #String #Dynamic_Programming #2022_03_26_Time_34_ms_(100.00%)_Space_42_MB_(100.00%)

public class Solution {
    public int numberOfArrays(String s, int k) {
        int kMod = 1000000007;
        int n = s.length();
        int[] dp = new int[n];
        if (s.charAt(n - 1) != '0') {
            dp[n - 1] = 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                continue;
            }
            long temp = 0;
            int j = i;
            while (j < n && temp * 10 + s.charAt(j) - '0' <= k) {
                temp = temp * 10 + s.charAt(j) - '0';
                if (j == n - 1) {
                    dp[i] += 1;
                } else {
                    dp[i] += dp[j + 1];
                }
                dp[i] %= kMod;
                j++;
            }
        }
        return dp[0];
    }
}
