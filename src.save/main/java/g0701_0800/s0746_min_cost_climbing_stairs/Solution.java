package g0701_0800.s0746_min_cost_climbing_stairs;

// #Easy #Array #Dynamic_Programming #Dynamic_Programming_I_Day_2
// #Level_1_Day_11_Dynamic_Programming #2022_03_25_Time_1_ms_(86.38%)_Space_43.6_MB_(54.14%)

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}
