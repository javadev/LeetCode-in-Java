package g1401_1500.s1406_stone_game_iii;

// #Hard #Array #Dynamic_Programming #Math #Game_Theory
// #2022_03_26_Time_14_ms_(82.02%)_Space_117_MB_(71.71%)

import java.util.Arrays;

public class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int[] dp = new int[stoneValue.length + 1];
        Arrays.fill(dp, 0);
        int i = stoneValue.length - 1;
        while (i >= 0) {
            int ans = Integer.MIN_VALUE;
            ans = Math.max(ans, stoneValue[i] - dp[i + 1]);
            if (i + 1 < stoneValue.length) {
                ans = Math.max(ans, stoneValue[i] + stoneValue[i + 1] - dp[i + 2]);
            }
            if (i + 2 < stoneValue.length) {
                ans =
                        Math.max(
                                ans,
                                stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - dp[i + 3]);
            }
            dp[i] = ans;
            i--;
        }
        int value = dp[0];
        if (value > 0) {
            return "Alice";
        }
        return value == 0 ? "Tie" : "Bob";
    }
}
