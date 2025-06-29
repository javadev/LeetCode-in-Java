package g3501_3600.s3599_partition_array_to_minimize_xor;

// #Medium #2025_06_29_Time_141_ms_(89.34%)_Space_45.26_MB_(46.16%)

import java.util.Arrays;

public class Solution {
    public int minXor(int[] nums, int k) {
        int n = nums.length;
        // Step 1: Prefix XOR array
        int[] pfix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pfix[i] = pfix[i - 1] ^ nums[i - 1];
        }
        // Step 2: DP table
        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        for (int i = 0; i <= n; i++) {
            // Base case: 1 partition
            dp[i][1] = pfix[i];
        }
        // Step 3: Fill DP for partitions 2 to k
        for (int parts = 2; parts <= k; parts++) {
            for (int end = parts; end <= n; end++) {
                for (int split = parts - 1; split < end; split++) {
                    int segmentXOR = pfix[end] ^ pfix[split];
                    int maxXOR = Math.max(dp[split][parts - 1], segmentXOR);
                    dp[end][parts] = Math.min(dp[end][parts], maxXOR);
                }
            }
        }
        return dp[n][k];
    }
}
