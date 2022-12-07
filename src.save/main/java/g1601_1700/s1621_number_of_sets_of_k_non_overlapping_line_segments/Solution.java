package g1601_1700.s1621_number_of_sets_of_k_non_overlapping_line_segments;

// #Medium #Dynamic_Programming #Math #2022_04_18_Time_16_ms_(94.74%)_Space_39.3_MB_(94.74%)

public class Solution {
    public int numberOfSets(int n, int k) {
        if (n - 1 >= k) {
            int[] dp = new int[k];
            int[] sums = new int[k];
            int mod = (int) (1e9 + 7);
            for (int diff = 1; diff < n - k + 1; diff++) {
                dp[0] = ((diff + 1) * diff) >> 1;
                sums[0] = (sums[0] + dp[0]) % mod;
                for (int segments = 2; segments <= k; segments++) {
                    dp[segments - 1] = (sums[segments - 2] + dp[segments - 1]) % mod;
                    sums[segments - 1] = (sums[segments - 1] + dp[segments - 1]) % mod;
                }
            }
            return dp[k - 1];
        } else {
            return 0;
        }
    }
}
