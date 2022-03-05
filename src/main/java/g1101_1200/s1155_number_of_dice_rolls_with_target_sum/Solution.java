package g1101_1200.s1155_number_of_dice_rolls_with_target_sum;

// #Medium #Dynamic_Programming #2022_03_05_Time_17_ms_(78.89%)_Space_43.1_MB_(25.85%)

import java.util.Arrays;

public class Solution {
    private int[][] memo;
    private int k;

    private int dp(int diceLeft, int targetLeft) {
        if (diceLeft == 0) {
            if (targetLeft == 0) {
                return 1;
            }
            return 0;
        }
        if (memo[diceLeft][targetLeft] == -1) {
            int res = 0;
            for (int i = 1; i <= Math.min(k, targetLeft); i++) {
                res += dp(diceLeft - 1, targetLeft - i);
                int modulo = 1000000007;
                res %= modulo;
            }
            memo[diceLeft][targetLeft] = res;
        }
        return memo[diceLeft][targetLeft];
    }

    public int numRollsToTarget(int n, int k, int target) {
        this.k = k;
        this.memo = new int[n + 1][target + 1];
        for (int[] i : memo) {
            Arrays.fill(i, -1);
        }
        return dp(n, target);
    }
}
