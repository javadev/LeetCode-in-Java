package g3201_3300.s3277_maximum_xor_score_subarray_queries;

// #Hard #Array #Dynamic_Programming #2024_09_04_Time_29_ms_(98.87%)_Space_104.3_MB_(65.54%)

@SuppressWarnings("java:S3012")
public class Solution {
    public int[] maximumSubarrayXor(int[] nums, int[][] queries) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] ^ dp[i + 1][j];
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j], Math.max(dp[i][j - 1], dp[i + 1][j]));
            }
        }
        int q = queries.length;
        int[] ans = new int[q];
        int time = 0;
        for (int[] query : queries) {
            ans[time++] = dp[query[0]][query[1]];
        }
        return ans;
    }
}
