package g0101_0200.s0132_palindrome_partitioning_ii;

// #Hard #String #Dynamic_Programming #Acceptance_33.2%
// #2022_02_22_Time_2_ms_(99.72%)_Space_41.7_MB_(75.39%)

import java.util.Arrays;

public class Solution {
    public int minCut(String s) {
        int n = s.length();
        char[] t = s.toCharArray();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = -1;
        int i = 0;
        while (i < n) {
            expandAround(t, i, i, dp);
            expandAround(t, i, i + 1, dp);
            i++;
        }
        return dp[n];
    }

    private void expandAround(char[] t, int i, int j, int[] dp) {
        while (i >= 0 && j < t.length && t[i] == t[j]) {
            dp[j + 1] = Math.min(dp[j + 1], dp[i] + 1);
            i--;
            j++;
        }
    }
}
