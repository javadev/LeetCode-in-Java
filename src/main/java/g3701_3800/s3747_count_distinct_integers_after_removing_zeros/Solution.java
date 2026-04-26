package g3701_3800.s3747_count_distinct_integers_after_removing_zeros;

// #Medium #Dynamic_Programming #Math #Staff #Weekly_Contest_476
// #2026_04_26_Time_1_ms_(100.00%)_Space_42.72_MB_(79.66%)

public class Solution {
    public long countDistinct(long n) {
        String digits = Long.toString(n);
        int m = digits.length();
        long[] power9 = new long[m + 1];
        power9[0] = 1;
        for (int i = 1; i <= m; i++) {
            power9[i] = power9[i - 1] * 9;
        }
        long total = 0;
        for (int length = 1; length < m; length++) {
            total += power9[length];
        }
        for (int idx = 0; idx < m; idx++) {
            int d = digits.charAt(idx) - '0';
            if (d == 0) {
                return total;
            }
            total += (d - 1) * power9[m - idx - 1];
        }
        return total + 1;
    }
}
