package g3701_3800.s3770_largest_prime_from_consecutive_prime_sum;

// #Medium #Array #Math #Number_Theory #Senior #Weekly_Contest_479
// #2026_05_08_Time_1_ms_(100.00%)_Space_42.47_MB_(96.28%)

public class Solution {
    static int[] ppr = {
        2, 5, 17, 41, 197, 281, 7699, 8893, 22039, 24133, 25237, 28697, 32353, 37561, 38921, 43201,
        44683, 55837, 61027, 66463, 70241, 86453, 102001, 109147, 116533, 119069, 121631, 129419,
        132059, 263171, 287137, 325019, 329401, 333821, 338279, 342761, 360979, 379667, 393961,
        398771
    };

    public int largestPrime(int n) {
        int i = 0;
        int j = ppr.length - 1;
        int r = 0;
        while (i <= j) {
            int m = (i + j) >> 1;
            if (ppr[m] <= n) {
                r = ppr[m];
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return r;
    }
}
