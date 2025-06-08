package g3501_3600.s3578_count_partitions_with_max_min_difference_at_most_k;

// #Medium #2025_06_08_Time_16_ms_(100.00%)_Space_55.13_MB_(98.92%)

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int[] prefix = new int[n + 1];
        prefix[0] = 1;
        int[] maxDeque = new int[n];
        int maxFront = 0;
        int maxBack = 0;
        int[] minDeque = new int[n];
        int minFront = 0;
        int minBack = 0;
        int start = 0;
        for (int end = 0; end < n; end++) {
            while (maxBack > maxFront && nums[maxDeque[maxBack - 1]] <= nums[end]) {
                maxBack--;
            }
            maxDeque[maxBack++] = end;
            while (minBack > minFront && nums[minDeque[minBack - 1]] >= nums[end]) {
                minBack--;
            }
            minDeque[minBack++] = end;
            while (nums[maxDeque[maxFront]] - nums[minDeque[minFront]] > k) {
                if (maxDeque[maxFront] == start) {
                    maxFront++;
                }
                if (minDeque[minFront] == start) {
                    minFront++;
                }
                start++;
            }
            int sum = prefix[end] - (start > 0 ? prefix[start - 1] : 0);
            if (sum < 0) {
                sum += MOD;
            }
            dp[end + 1] = sum % MOD;
            prefix[end + 1] = (prefix[end] + dp[end + 1]) % MOD;
        }
        return dp[n];
    }
}
