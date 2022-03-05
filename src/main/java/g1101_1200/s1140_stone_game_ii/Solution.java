package g1101_1200.s1140_stone_game_ii;

// #Medium #Array #Dynamic_Programming #Math #Game_Theory
// #2022_03_05_Time_7_ms_(68.62%)_Space_42.3_MB_(48.99%)

import java.util.Arrays;

public class Solution {
    private int solve(int i, int m, int[] piles, int[][] dp) {
        if (i >= piles.length) {
            return 0;
        }
        if (dp[i][m] != -1) {
            return dp[i][m];
        }
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int j = 0; j < 2 * m && i + j < piles.length; j++) {
            sum += piles[i + j];
            ans = Math.max(ans, sum - solve(i + j + 1, Math.max(j + 1, m), piles, dp));
        }
        return ans;
    }

    public int stoneGameII(int[] piles) {
        int sum = 0;
        int[][] dp = new int[piles.length][piles.length + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        for (int ele : piles) {
            sum += ele;
        }
        int diff = solve(0, 1, piles, dp);
        return (sum + diff) / 2;
    }
}
