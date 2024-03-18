package g0401_0500.s0494_target_sum;

// #Medium #Array #Dynamic_Programming #Backtracking #Big_O_Time_O(n*(sum+s))_Space_O(n*(sum+s))
// #2022_07_21_Time_9_ms_(79.99%)_Space_45.2_MB_(32.79%)

public class Solution {
    public int findTargetSumWays(int[] nums, int s) {
        int sum = 0;
        s = Math.abs(s);
        for (int num : nums) {
            sum += num;
        }
        // Invalid s, just return 0
        if (s > sum || (sum + s) % 2 != 0) {
            return 0;
        }
        int[][] dp = new int[(sum + s) / 2 + 1][nums.length + 1];
        dp[0][0] = 1;
        // empty knapsack must be processed specially
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                dp[0][i + 1] = dp[0][i] * 2;
            } else {
                dp[0][i + 1] = dp[0][i];
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                dp[i][j + 1] += dp[i][j];
                if (nums[j] <= i) {
                    dp[i][j + 1] += dp[i - nums[j]][j];
                }
            }
        }
        return dp[(sum + s) / 2][nums.length];
    }
}
