package g1501_1600.s1510_stone_game_iv;

// #Hard #Dynamic_Programming #Math #Game_Theory
// #2022_04_09_Time_12_ms_(85.75%)_Space_39.2_MB_(96.63%)

public class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int k = 1; k * k <= i; k++) {
                if (!dp[i - k * k]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
