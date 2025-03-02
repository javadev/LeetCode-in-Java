package g3401_3500.s3473_sum_of_k_subarrays_with_length_at_least_m;

// #Medium #2025_03_02_Time_198_ms_(100.00%)_Space_83.70_MB_(100.00%)

public class Solution {
    public int maxSum(int[] nums, int k, int m) {
        int n = nums.length;
        // Calculate prefix sums
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        // using elements from nums[0...i-1]
        int[][] dp = new int[n + 1][k + 1];
        // Initialize dp array
        for (int j = 1; j <= k; j++) {
            for (int i = 0; i <= n; i++) {
                dp[i][j] = Integer.MIN_VALUE / 2;
            }
        }
        // Fill dp array
        for (int j = 1; j <= k; j++) {
            int[] maxPrev = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
                maxPrev[i] =
                        (i == 0)
                                ? dp[0][j - 1] - prefixSum[0]
                                : Math.max(maxPrev[i - 1], dp[i][j - 1] - prefixSum[i]);
            }
            for (int i = m; i <= n; i++) {
                // Option 1: Don't include the current element in any new subarray
                dp[i][j] = dp[i - 1][j];
                // Option 2: Form a new subarray ending at position i
                // Find the best starting position for the subarray
                dp[i][j] = Math.max(dp[i][j], prefixSum[i] + maxPrev[i - m]);
            }
        }
        return dp[n][k];
    }
}
