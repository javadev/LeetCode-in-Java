package g2201_2300.s2218_maximum_value_of_k_coins_from_piles;

// #Hard #Array #Dynamic_Programming #Prefix_Sum
// #2022_06_12_Time_54_ms_(96.38%)_Space_42.3_MB_(97.46%)

import java.util.List;

public class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int[] dp = new int[k + 1];
        for (List<Integer> pile : piles) {
            int m = pile.size();
            int[] cum = new int[m + 1];
            for (int i = 0; i < m; i++) {
                cum[i + 1] = cum[i] + pile.get(i);
            }
            int[] curdp = new int[k + 1];
            for (int i = 0; i <= k; i++) {
                for (int j = 0; j <= m && i + j <= k; j++) {
                    curdp[i + j] = Math.max(curdp[i + j], dp[i] + cum[j]);
                }
            }
            dp = curdp;
        }
        return dp[k];
    }
}
