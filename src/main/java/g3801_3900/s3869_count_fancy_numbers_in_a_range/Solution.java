package g3801_3900.s3869_count_fancy_numbers_in_a_range;

// #Hard #Dynamic_Programming #Math #Senior_Staff #Biweekly_Contest_178
// #2026_07_28_Time_86_ms_(96.00%)_Space_47.18_MB_(90.00%)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private char[] low;
    private char[] high;
    private long[][][][] dp;
    private boolean[] good;

    public long countFancy(long l, long r) {
        initBounds(l, r);
        initGood();
        initDp();
        long ans = dfs(0, 0, 1, 1);
        Set<Long> seen = new HashSet<>();
        addIncreasingNumbers(seen, l, r);
        addDecreasingNumbers(seen, l, r);
        return ans + seen.size();
    }

    private void initBounds(long l, long r) {
        String left = Long.toString(l);
        String right = Long.toString(r);
        int n = right.length();
        left = "0".repeat(n - left.length()) + left;
        low = left.toCharArray();
        high = right.toCharArray();
    }

    private void initGood() {
        good = new boolean[136];
        for (int i = 1; i <= 135; i++) {
            good[i] = isGood(i);
        }
    }

    private void initDp() {
        dp = new long[high.length + 1][136][2][2];
        for (long[][][] a : dp) {
            for (long[][] b : a) {
                for (long[] c : b) {
                    Arrays.fill(c, -1);
                }
            }
        }
    }

    private void addIncreasingNumbers(Set<Long> seen, long l, long r) {
        for (int mask = 1; mask < (1 << 9); mask++) {
            long x = 0;
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                if ((mask & (1 << i)) != 0) {
                    x = x * 10 + i + 1;
                    sum += i + 1;
                }
            }
            if (x >= l && x <= r && !good[sum]) {
                seen.add(x);
            }
        }
    }

    private void addDecreasingNumbers(Set<Long> seen, long l, long r) {
        for (int mask = 1; mask < (1 << 10); mask++) {
            long x = 0;
            int sum = 0;
            boolean started = false;
            for (int i = 0; i < 10; i++) {
                if ((mask & (1 << i)) != 0) {
                    int d = 9 - i;
                    if (started || d != 0) {
                        started = true;
                        x = x * 10 + d;
                        sum += d;
                    }
                }
            }
            if (started && x >= l && x <= r && !good[sum]) {
                seen.add(x);
            }
        }
    }

    private long dfs(int pos, int sum, int tl, int tr) {
        if (pos == high.length) {
            return good[sum] ? 1 : 0;
        }
        if (dp[pos][sum][tl][tr] != -1) {
            return dp[pos][sum][tl][tr];
        }
        int lo = tl == 1 ? low[pos] - '0' : 0;
        int hi = tr == 1 ? high[pos] - '0' : 9;
        long res = 0;
        for (int d = lo; d <= hi; d++) {
            res += dfs(pos + 1, sum + d, nextTight(tl, d, lo), nextTight(tr, d, hi));
        }
        dp[pos][sum][tl][tr] = res;
        return res;
    }

    private int nextTight(int tight, int digit, int limit) {
        return tight == 1 && digit == limit ? 1 : 0;
    }

    private boolean isGood(int x) {
        if (x < 10) {
            return true;
        }
        char[] s = Integer.toString(x).toCharArray();
        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < s.length; i++) {
            if (s[i] <= s[i - 1]) {
                inc = false;
            }
            if (s[i] >= s[i - 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
