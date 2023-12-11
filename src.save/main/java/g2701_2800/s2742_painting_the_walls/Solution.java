package g2701_2800.s2742_painting_the_walls;

// #Hard #Array #Dynamic_Programming #2023_09_23_Time_8_ms_(98.78%)_Space_43_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, (int) 1e9);
        dp[0] = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = n; j > 0; --j) {
                dp[j] = Math.min(dp[j], dp[Math.max(j - time[i] - 1, 0)] + cost[i]);
            }
        }

        return dp[n];
    }
}
