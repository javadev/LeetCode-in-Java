package g1401_1500.s1494_parallel_courses_ii;

// #Hard #Dynamic_Programming #Bit_Manipulation #Graph #Bitmask
// #2022_03_23_Time_325_ms_(42.24%)_Space_43.3_MB_(52.43%)

import java.util.Arrays;

public class Solution {
    public int minNumberOfSemesters(int n, int[][] relations, int k) {
        int[] pres = new int[n];
        for (int[] r : relations) {
            int prev = r[0] - 1;
            int next = r[1] - 1;
            pres[next] |= (1 << prev);
        }
        int[] dp = new int[1 << n];
        Arrays.fill(dp, n);
        dp[0] = 0;
        for (int mask = 0; mask < dp.length; mask++) {
            int canTake = 0;
            for (int i = 0; i < n; i++) {
                // already taken
                if ((mask & (1 << i)) != 0) {
                    continue;
                }
                // satisfy all pres
                if ((mask & pres[i]) == pres[i]) {
                    canTake |= (1 << i);
                }
            }
            // loop each sub-masks
            for (int take = canTake; take > 0; take = (take - 1) & canTake) {
                if (Integer.bitCount(take) > k) {
                    continue;
                }
                dp[take | mask] = Math.min(dp[take | mask], dp[mask] + 1);
            }
        }
        return dp[(1 << n) - 1];
    }
}
