package g0401_0500.s0494_target_sum;

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Backtracking
// #2022_03_19_Time_10_ms_(82.41%)_Space_44.5_MB_(37.47%)

public class Solution {
    public int findTargetSumWays(int[] nums, int s) {
        int sum = 0;
        s = Math.abs(s);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
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
