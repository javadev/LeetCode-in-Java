package g0401_0500.s0464_can_i_win;

// #Medium #Dynamic_Programming #Math #Bit_Manipulation #Bitmask #Memoization #Game_Theory
// #2022_07_19_Time_138_ms_(90.47%)_Space_76.4_MB_(82.84%)

public class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= maxChoosableInteger) {
            return true;
        }
        if (1.0 * maxChoosableInteger * (1 + maxChoosableInteger) / 2 < desiredTotal) {
            return false;
        }
        return canWin(0, new Boolean[1 << maxChoosableInteger], desiredTotal, maxChoosableInteger);
    }

    private boolean canWin(int state, Boolean[] dp, int desiredTotal, int maxChoosableInteger) {
        // state is the bitmap representation of the current state of choosable integers left
        // dp[state] represents whether the current player can win the game at state
        if (dp[state] != null) {
            return dp[state];
        }
        for (int i = 1; i <= maxChoosableInteger; i++) {
            // current number to pick
            int cur = 1 << (i - 1);
            if ((cur & state) == 0
                    && (i >= desiredTotal
                            || !canWin(state | cur, dp, desiredTotal - i, maxChoosableInteger))) {
                // i is greater than the desired total
                // or the other player cannot win after the current player picks i
                dp[state] = true;
                return dp[state];
            }
        }
        dp[state] = false;
        return dp[state];
    }
}
