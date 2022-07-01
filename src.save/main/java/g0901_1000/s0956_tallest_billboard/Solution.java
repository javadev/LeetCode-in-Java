package g0901_1000.s0956_tallest_billboard;

// #Hard #Array #Dynamic_Programming #2022_03_30_Time_18_ms_(92.68%)_Space_54.4_MB_(57.72%)

import java.util.Arrays;

public class Solution {
    public int tallestBillboard(int[] rods) {
        int maxDiff = 0;
        for (int rod : rods) {
            maxDiff += rod;
        }
        int[] dp = new int[maxDiff + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int l : rods) {
            int[] dpOld = new int[maxDiff + 1];
            System.arraycopy(dp, 0, dpOld, 0, maxDiff + 1);
            for (int diff = 0; diff < maxDiff + 1; diff++) {
                if (dpOld[diff] == -1) {
                    continue;
                }
                if (diff + l <= maxDiff) {
                    dp[diff + l] = Math.max(dp[diff + l], dpOld[diff] + l);
                }
                if (l - diff >= 0) {
                    dp[l - diff] = Math.max(dp[l - diff], l + dpOld[diff] - diff);
                } else {
                    dp[diff - l] = Math.max(dp[diff - l], dpOld[diff]);
                }
            }
        }
        return dp[0];
    }
}
