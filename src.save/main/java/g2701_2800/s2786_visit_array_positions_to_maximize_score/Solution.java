package g2701_2800.s2786_visit_array_positions_to_maximize_score;

// #Medium #Array #Dynamic_Programming #2023_09_15_Time_5_ms_(100.00%)_Space_54.5_MB_(99.95%)

public class Solution {
    public long maxScore(int[] nums, int x) {
        long[] dp = {-x, -x};
        dp[nums[0] & 1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            long toggle = dp[nums[i] & 1 ^ 1] - x;
            long nottoggle = dp[nums[i] & 1];
            dp[nums[i] & 1] = Math.max(toggle, nottoggle) + nums[i];
        }
        return Math.max(dp[0], dp[1]);
    }
}
