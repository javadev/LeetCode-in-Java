package g0501_0600.s0518_coin_change_2;

// #Medium #Array #Dynamic_Programming #Dynamic_Programming_I_Day_20
// #2022_07_25_Time_4_ms_(84.67%)_Space_42.2_MB_(60.30%)

public class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
