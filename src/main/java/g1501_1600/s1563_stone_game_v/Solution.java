package g1501_1600.s1563_stone_game_v;

// #Hard #Array #Dynamic_Programming #Math #Game_Theory
// #2022_04_11_Time_36_ms_(95.56%)_Space_54.3_MB_(17.78%)

public class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] ps = new int[n];
        ps[0] = stoneValue[0];
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + stoneValue[i];
        }
        return gameDP(ps, 0, n - 1, new Integer[n][n]);
    }

    private int gameDP(int[] ps, int i, int j, Integer[][] dp) {
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        int max = 0;
        for (int k = i + 1; k <= j; k++) {
            int l = ps[k - 1] - (i == 0 ? 0 : ps[i - 1]);
            int r = ps[j] - ps[k - 1];
            if (2 * Math.min(l, r) < max) {
                continue;
            }
            if (l <= r) {
                max = Math.max(max, l + gameDP(ps, i, k - 1, dp));
            }
            if (l >= r) {
                max = Math.max(max, r + gameDP(ps, k, j, dp));
            }
        }
        dp[i][j] = max;
        return max;
    }
}
