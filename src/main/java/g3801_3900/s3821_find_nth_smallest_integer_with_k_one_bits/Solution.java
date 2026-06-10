package g3801_3900.s3821_find_nth_smallest_integer_with_k_one_bits;

// #Hard #Math #Bit_Manipulation #Combinatorics #Senior_Staff #Weekly_Contest_486
// #2026_06_09_Time_2_ms_(98.59%)_Space_42.60_MB_(90.14%)

public class Solution {
    private static final int MX = 60;
    private static final long[][] C = new long[MX][MX + 1];

    static {
        for (int i = 0; i < MX; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }
    }

    public long nthSmallest(long n, int k) {
        long ans = 0;
        for (int i = 50; i >= 0; i--) {
            long count = C[i][k];
            if (n > count) {
                n -= count;
                ans |= (1L << i);
                k--;
                if (k == 0) {
                    break;
                }
            }
        }
        return ans;
    }
}
