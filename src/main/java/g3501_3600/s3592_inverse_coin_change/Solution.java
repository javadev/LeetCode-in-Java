package g3501_3600.s3592_inverse_coin_change;

// #Medium #2025_06_22_Time_1_ms_(100.00%)_Space_45.32_MB_(51.67%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findCoins(int[] numWays) {
        int n = numWays.length;
        int[] dp = new int[n + 1];
        List<Integer> coins = new ArrayList<>();
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            int amount = i + 1;
            int ways = numWays[i];
            if (ways > 0 && dp[amount] == ways - 1) {
                coins.add(amount);
                for (int coin = amount; coin <= n; coin++) {
                    dp[coin] += dp[coin - amount];
                }
            }
            if (dp[amount] != ways) {
                return new ArrayList<>();
            }
        }
        return coins;
    }
}
