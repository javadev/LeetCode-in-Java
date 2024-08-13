package g3201_3300.s3251_find_the_count_of_monotonic_pairs_ii;

// #Hard #Array #Dynamic_Programming #Math #Prefix_Sum #Combinatorics
// #2024_08_13_Time_24_ms_(100.00%)_Space_44.7_MB_(97.70%)

import java.util.Arrays;

public class Solution {
    private static final int MOD = 1000000007;

    public int countOfPairs(int[] nums) {
        int prefixZeros = 0;
        int n = nums.length;
        // Calculate prefix zeros
        for (int i = 1; i < n; i++) {
            prefixZeros += Math.max(nums[i] - nums[i - 1], 0);
        }
        int row = n + 1;
        int col = nums[n - 1] + 1 - prefixZeros;
        if (col <= 0) {
            return 0;
        }
        // Initialize dp array
        int[] dp = new int[col];
        Arrays.fill(dp, 1);
        // Fill dp array
        for (int r = 1; r < row; r++) {
            for (int c = 1; c < col; c++) {
                dp[c] = (dp[c] + dp[c - 1]) % MOD;
            }
        }
        return dp[col - 1];
    }
}
