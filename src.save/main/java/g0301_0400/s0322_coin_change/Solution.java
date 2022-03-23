package g0301_0400.s0322_coin_change;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Breadth_First_Search #Algorithm_II_Day_18_Dynamic_Programming #Dynamic_Programming_I_Day_20
// #2022_03_15_Time_22_ms_(72.14%)_Space_44.8_MB_(58.75%)

public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                int prev = dp[i - coin];
                if (prev > 0) {
                    if (dp[i] == 0) {
                        dp[i] = prev + 1;
                    } else {
                        dp[i] = Math.min(dp[i], prev + 1);
                    }
                }
            }
        }
        return dp[amount] - 1;
    }
}
