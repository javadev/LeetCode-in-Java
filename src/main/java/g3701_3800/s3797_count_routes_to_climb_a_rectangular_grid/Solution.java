package g3701_3800.s3797_count_routes_to_climb_a_rectangular_grid;

// #Hard #Array #Dynamic_Programming #Matrix #Prefix_Sum #Senior_Staff #Biweekly_Contest_173
// #2026_05_22_Time_89_ms_(89.19%)_Space_57.00_MB_(81.08%)

import java.util.Arrays;

public class Solution {
    public int numberOfRoutes(String[] grid, int d) {
        int n = grid.length;
        int m = grid[0].length();
        long mod = 1_000_000_007;
        long[] dp = null;
        for (int i = n - 1; i >= 0; i--) {
            String r = grid[i];
            if (dp == null) {
                long[] init = new long[m];
                Arrays.fill(init, 1);
                dp = f(init, 0, r, m, mod);
            } else {
                int d2 = (int) Math.sqrt((double) d * d - 1);
                dp = f(dp, d2, r, m, mod);
            }
            dp = f(dp, d, r, m, mod);
        }
        long res = 0;
        for (long v : dp) {
            res = (res + v) % mod;
        }
        return (int) (res);
    }

    private long[] f(long[] dp, int dist, String r, int m, long mod) {
        long[] dp2 = new long[m];
        long window = 0;
        for (int k = 0; k <= Math.min(m - 1, dist); k++) {
            window += dp[k];
        }
        dp2[0] = window;
        for (int j = 1; j < m; j++) {
            window = dp2[j - 1];
            if (j - dist - 1 >= 0) {
                window -= dp[j - dist - 1];
            }
            if (j + dist < m) {
                window += dp[j + dist];
            }
            dp2[j] = window;
        }
        for (int j = 0; j < m; j++) {
            dp2[j] = (r.charAt(j) == '#') ? 0 : dp2[j] % mod;
        }
        return dp2;
    }
}
