package g3601_3700.s3699_number_of_zigzag_arrays_i;

// #Hard #Dynamic_Programming #Prefix_Sum #Weekly_Contest_469
// #2025_10_07_Time_197_ms_(97.34%)_Space_43.41_MB_(92.35%)

import java.util.Arrays;

public class Solution {
    public int zigZagArrays(int n, int l, int r) {
        int mod = (int) (1e9 + 7);
        r -= l;
        long[] prefix = new long[r];
        Arrays.fill(prefix, 1);
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] += prefix[i - 1];
        }
        boolean zig = true;
        for (int i = 1; i < n - 1; i++) {
            if (zig) {
                for (int j = prefix.length - 2; j >= 0; j--) {
                    prefix[j] += prefix[j + 1];
                    prefix[j] %= mod;
                }
            } else {
                for (int j = 1; j < prefix.length; j++) {
                    prefix[j] += prefix[j - 1];
                    prefix[j] %= mod;
                }
            }
            zig = !zig;
        }
        long result = 0;
        for (long p : prefix) {
            result += p;
            result %= mod;
        }
        result *= 2;
        result %= mod;
        return (int) result;
    }
}
