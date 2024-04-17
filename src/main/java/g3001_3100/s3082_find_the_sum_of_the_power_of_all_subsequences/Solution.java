package g3001_3100.s3082_find_the_sum_of_the_power_of_all_subsequences;

// #Hard #Array #Dynamic_Programming #2024_04_17_Time_1_ms_(100.00%)_Space_42.5_MB_(98.13%)

public class Solution {
    public int sumOfPower(int[] nums, int k) {
        final int kMod = 1_000_000_007;
        int[] dp = new int[k + 1];
        dp[0] = 1;
        for (final int num : nums) {
            for (int i = k; i >= 0; --i) {
                if (i < num) {
                    dp[i] = (int) ((dp[i] * 2L) % kMod);
                } else {
                    dp[i] = (int) ((dp[i] * 2L + dp[i - num]) % kMod);
                }
            }
        }
        return dp[k];
    }
}
