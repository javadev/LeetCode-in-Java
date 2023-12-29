package g2901_3000.s2919_minimum_increment_operations_to_make_array_beautiful;

// #Medium #Array #Dynamic_Programming #2023_12_29_Time_4_ms_(64.62%)_Space_56.2_MB_(98.28%)

public class Solution {
    public long minIncrementOperations(int[] nums, int k) {
        long[] dp = new long[nums.length];
        dp[0] = Math.max(0, k - nums[0]);
        dp[1] = Math.max(0, k - nums[1]);
        dp[2] = Math.max(0, k - nums[2]);
        for (int i = 3; i < nums.length; i++) {
            dp[i] = Math.max(0, k - nums[i]) + Math.min(Math.min(dp[i - 3], dp[i - 2]), dp[i - 1]);
        }
        return Math.min(Math.min(dp[nums.length - 3], dp[nums.length - 2]), dp[nums.length - 1]);
    }
}
