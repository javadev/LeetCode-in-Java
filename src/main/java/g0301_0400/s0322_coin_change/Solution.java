package g0301_0400.s0322_coin_change;

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Breadth_First_Search
// #Algorithm_II_Day_18_Dynamic_Programming #Dynamic_Programming_I_Day_20
// #Level_2_Day_12_Dynamic_Programming #Big_O_Time_O(m*n)_Space_O(amount)
// #2022_07_09_Time_17_ms_(91.77%)_Space_41.8_MB_(95.50%)

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
