package g3801_3900.s3806_maximum_bitwise_and_after_increment_operations;

// #Hard #Array #Sorting #Greedy #Bit_Manipulation #Senior_Staff #Weekly_Contest_484
// #2026_06_09_Time_107_ms_(78.72%)_Space_51.33_MB_(44.68%)

import java.util.Arrays;

public class Solution {
    public int maximumAND(int[] a, int b, int c) {
        long e = 0;
        int f = a.length;
        long[] g = new long[f];
        for (int h = 30; h >= 0; --h) {
            long i = e | (1L << h);
            for (int j = 0; j < f; ++j) {
                long k = a[j];
                long l = i & ~k;
                if (l == 0) {
                    g[j] = 0;
                } else {
                    int n = 63 - Long.numberOfLeadingZeros(l);
                    while (((k >> n) & 1) == 1) {
                        n++;
                    }
                    long o = (1L << n) - 1;
                    g[j] = ((k & ~o) | (1L << n) | (i & o)) - k;
                }
            }
            Arrays.sort(g);
            long p = 0;
            for (int q = 0; q < c; ++q) {
                p += g[q];
            }
            if (p <= b) {
                e = i;
            }
        }
        return (int) e;
    }
}
