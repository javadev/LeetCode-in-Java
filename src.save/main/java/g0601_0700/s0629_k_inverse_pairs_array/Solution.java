package g0601_0700.s0629_k_inverse_pairs_array;

// #Hard #Dynamic_Programming

public class Solution {
    public int kinversePairs(int n, int k) {
        k = Math.min(k, n * (n - 1) / 2 - k);
        if (k < 0) {
            return 0;
        }
        int[] dp = new int[k + 1];
        int[] dp1 = new int[k + 1];
        dp[0] = 1;
        dp1[0] = 1;
        int mod = 1_000_000_007;
        for (int i = 1; i <= n; i++) {
            int[] temp = dp;
            dp = dp1;
            dp1 = temp;
            for (int j = 1, m = Math.min(k, i * (i - 1) / 2); j <= m; j++) {
                dp[j] = (dp1[j] + dp[j - 1] - (j >= i ? dp1[j - i] : 0)) % mod;
                if (dp[j] < 0) {
                    dp[j] += mod;
                }
            }
        }
        return dp[k];
    }
}
