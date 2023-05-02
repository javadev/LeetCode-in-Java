package g0401_0500.s0486_predict_the_winner;

// #Medium #Array #Dynamic_Programming #Math #Recursion #Game_Theory
// #2022_07_21_Time_1_ms_(85.17%)_Space_42_MB_(17.19%)

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
