package g2601_2700.s2607_make_k_subarray_sums_equal;

// #Medium #Array #Math #Sorting #Number_Theory
// #2023_08_29_Time_24_ms_(99.15%)_Space_59.2_MB_(55.08%)

import java.util.Arrays;

public class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
        int n = arr.length;
        int h = gcd(n, k);
        int q = n / h;
        long ans = 0;
        for (int i = 0; i < h; i++) {
            int[] x = new int[q];
            for (int j = 0; j < q; j++) {
                x[j] = arr[(h * j) + i];
            }
            Arrays.sort(x);
            int v = q / 2;
            int u = q % 2 == 0 ? (x[v] + x[v - 1]) / 2 : x[v];
            for (int o = 0; o < q; o++) {
                ans += Math.abs(u - x[o]);
            }
        }
        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, Math.abs(a - b));
        }
    }
}
