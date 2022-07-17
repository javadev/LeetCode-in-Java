package g1801_1900.s1872_stone_game_viii;

// #Hard #Array #Dynamic_Programming #Math #Prefix_Sum #Game_Theory
// #2022_05_11_Time_3_ms_(98.18%)_Space_50.9_MB_(98.18%)

public class Solution {
    public int stoneGameVIII(int[] stones) {
        if (stones == null || stones.length <= 1) {
            return 0;
        }
        int n = stones.length;
        for (int i = 1; i < n; i++) {
            stones[i] = stones[i - 1] + stones[i];
        }
        // presum stones[] is ready;
        // dp[n-2]
        int dp = stones[n - 1];
        // The game stops when only one stone is left in the row.
        for (int i = n - 3; i >= 0; i--) {
            dp = Math.max(stones[i + 1] - dp, dp);
        }
        return dp;
    }
}
