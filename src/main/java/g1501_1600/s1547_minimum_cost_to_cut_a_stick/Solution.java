package g1501_1600.s1547_minimum_cost_to_cut_a_stick;

// #Hard #Array #Dynamic_Programming #2022_04_11_Time_6_ms_(100.00%)_Space_41.9_MB_(90.56%)

import java.util.Arrays;

public class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int m = cuts.length;
        int[][] dp = new int[m + 1][m + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= m - i; j++) {
                int k = j + i;
                int min = Integer.MAX_VALUE;
                for (int p = j; p < k; p++) {
                    min = Math.min(min, dp[j][p] + dp[p + 1][k]);
                }
                int len = (k == m ? n : cuts[k]) - (j == 0 ? 0 : cuts[j - 1]);
                dp[j][k] = min + len;
            }
        }
        return dp[0][m];
    }
}
