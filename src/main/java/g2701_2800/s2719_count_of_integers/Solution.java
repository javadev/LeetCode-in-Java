package g2701_2800.s2719_count_of_integers;

// #Hard #String #Dynamic_Programming #Math #2023_09_18_Time_15_ms_(97.70%)_Space_44.2_MB_(82.18%)

import java.util.Arrays;

public class Solution {
    private int[][][][] dp;
    private static final int MOD = (int) (1e9 + 7);

    private int countStrings(
            int i, boolean tight1, boolean tight2, int sum, String num1, String num2) {
        if (sum < 0) {
            return 0;
        }
        if (i == num2.length()) {
            return 1;
        }
        if (dp[i][tight1 ? 1 : 0][tight2 ? 1 : 0][sum] != -1) {
            return dp[i][tight1 ? 1 : 0][tight2 ? 1 : 0][sum];
        }
        int lo = tight1 ? (num1.charAt(i) - '0') : 0;
        int hi = tight2 ? (num2.charAt(i) - '0') : 9;
        int count = 0;
        for (int idx = lo; idx <= hi; idx++) {
            count =
                    (count % MOD
                                    + countStrings(
                                                    i + 1,
                                                    tight1 && (idx == lo),
                                                    tight2 && (idx == hi),
                                                    sum - idx,
                                                    num1,
                                                    num2)
                                            % MOD)
                            % MOD;
        }

        dp[i][tight1 ? 1 : 0][tight2 ? 1 : 0][sum] = count;
        return count;
    }

    public int count(String num1, String num2, int minSum, int maxSum) {
        int maxLength = num2.length();
        int minLength = num1.length();
        int leadingZeroes = maxLength - minLength;
        String num1extended = "0".repeat(leadingZeroes) + num1;
        dp = new int[maxLength][2][2][401];
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    Arrays.fill(dp[i][j][k], -1);
                }
            }
        }
        int total = countStrings(0, true, true, maxSum, num1extended, num2);
        int unnecessary = countStrings(0, true, true, minSum - 1, num1extended, num2);
        int ans = (total - unnecessary) % MOD;
        if (ans < 0) {
            ans += MOD;
        }
        return ans;
    }
}
