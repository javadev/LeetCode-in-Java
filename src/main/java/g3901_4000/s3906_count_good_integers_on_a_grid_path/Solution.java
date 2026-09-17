package g3901_4000.s3906_count_good_integers_on_a_grid_path;

// #Hard #Dynamic_Programming #Senior_Staff #Weekly_Contest_498
// #2026_09_17_Time_7_ms_(93.94%)_Space_46.60_MB_(72.73%)

import java.util.Arrays;

public class Solution {
    private StringBuilder a;
    private StringBuilder b;
    private boolean[] arr;
    private final long[][] dp = new long[16][11];

    private long rec(int idx, int tl, int tu, int prev) {
        int n = 16;
        if (idx == n) {
            return 1;
        }
        if (tl == 0 && tu == 0 && dp[idx][prev] != -1) {
            return dp[idx][prev];
        }
        long res = 0;
        int lb = (tl == 1) ? a.charAt(idx) - '0' : 0;
        int ub = (tu == 1) ? b.charAt(idx) - '0' : 9;
        for (int digit = lb; digit <= ub; digit += 1) {
            int ntl = (tl == 1 && digit == lb) ? 1 : 0;
            int ntu = (tu == 1 && digit == ub) ? 1 : 0;
            if (arr[idx] || prev == 10) {
                if (prev != 10 && digit < prev) {
                    continue;
                }
                res += rec(idx + 1, ntl, ntu, digit);
                continue;
            }
            res += rec(idx + 1, ntl, ntu, prev);
        }
        if (tl == 0 && tu == 0) {
            dp[idx][prev] = res;
        }
        return res;
    }

    public long countGoodIntegersOnPath(long l, long r, String s) {
        a = new StringBuilder(String.valueOf(l));
        b = new StringBuilder(String.valueOf(r));
        while (b.length() < 16) {
            b.insert(0, '0');
        }
        while (a.length() < 16) {
            a.insert(0, '0');
        }
        arr = new boolean[16];
        arr[0] = true;
        int i = 0;
        int j = 0;
        for (int k = 0; k < 6; k++) {
            char c = s.charAt(k);
            if (c == 'D') {
                i += 1;
            } else {
                j += 1;
            }
            arr[(i * 4) + j] = true;
        }
        for (long[] x : dp) {
            Arrays.fill(x, -1);
        }
        return rec(0, 1, 1, 10);
    }
}
