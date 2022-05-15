package g0401_0500.s0486_predict_the_winner;

// #Medium #Array #Dynamic_Programming #Math #Recursion #Game_Theory #Acceptance_50.3%
// #2022_03_18_Time_0_ms_(100.00%)_Space_39.6_MB_(74.06%)

@SuppressWarnings("java:S3012")
public class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }
        for (int len = 1; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][n - 1] >= 0;
    }
}
