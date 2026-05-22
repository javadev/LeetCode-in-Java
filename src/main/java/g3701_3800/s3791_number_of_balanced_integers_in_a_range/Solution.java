package g3701_3800.s3791_number_of_balanced_integers_in_a_range;

// #Hard #Dynamic_Programming #Principal #Weekly_Contest_482
// #2026_05_22_Time_75_ms_(83.12%)_Space_46.63_MB_(70.13%)

import java.util.Arrays;

public class Solution {
    private long solve(String number, int idx, int diff, int tight, long[][][] dp) {
        if (idx == number.length()) {
            return diff == 0 ? 1 : 0;
        }
        if (dp[idx][diff + dp[0].length / 2][tight] != -1) {
            return dp[idx][diff + dp[0].length / 2][tight];
        }

        long ans = 0;
        int ub = tight == 1 ? number.charAt(idx) - '0' : 9;
        for (int i = 0; i <= ub; i++) {
            int newTight = (tight == 1 && i == ub) ? 1 : 0;
            if (idx % 2 == 0) {
                ans += solve(number, idx + 1, diff - i, newTight, dp);
            } else {
                ans += solve(number, idx + 1, diff + i, newTight, dp);
            }
        }
        dp[idx][diff + dp[0].length / 2][tight] = ans;
        return dp[idx][diff + dp[0].length / 2][tight];
    }

    private long solve(long num) {
        if (num == 0) {
            return 1;
        }
        String number = Long.toString(num);
        int len = number.length();
        long[][][] dp =
                len % 2 == 1 ? new long[len][(len + 1) * 9 + 1][2] : new long[len][len * 9 + 1][2];

        for (long[][] tbl : dp) {
            for (long[] row : tbl) {
                Arrays.fill(row, -1);
            }
        }

        return solve(number, 0, 0, 1, dp);
    }

    public long countBalanced(long low, long high) {
        return solve(high) - solve(low - 1);
    }
}
