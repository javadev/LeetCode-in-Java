package g0701_0800.s0790_domino_and_tromino_tiling;

// #Medium #Dynamic_Programming #2022_03_26_Time_0_ms_(100.00%)_Space_42_MB_(14.39%)

public class Solution {
    public int numTilings(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 5;
        } else if (n == 4) {
            return 11;
        } else if (n == 5) {
            return 24;
        }
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        dp[4] = 11;
        dp[5] = 24;
        dp[6] = 53;
        for (int i = 7; i <= n; i++) {
            dp[i] = ((dp[i - 1] * 2) + dp[i - 3]) % 1000000007;
        }
        return (int) dp[n] % 1000000007;
    }
}
