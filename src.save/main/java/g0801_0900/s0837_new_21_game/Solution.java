package g0801_0900.s0837_new_21_game;

// #Medium #Dynamic_Programming #Math #Sliding_Window #Probability_and_Statistics
// #2022_03_24_Time_5_ms_(77.70%)_Space_43.8_MB_(59.58%)

public class Solution {
    public double new21Game(int n, int k, int w) {
        if (n >= k + w || k == 0) {
            return 1.0;
        }
        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double res = 0.0;
        double runningSum = dp[0];
        for (int i = 1; i <= n; i++) {
            dp[i] = runningSum / w;
            if (i < k) {
                runningSum += dp[i];
            } else {
                res += dp[i];
            }
            if (i - w >= 0) {
                runningSum -= dp[i - w];
            }
        }
        return res;
    }
}
