package g0001_0100.s0060_permutation_sequence;

// #Hard #Math #Recursion #2023_08_11_Time_0_ms_(100.00%)_Space_40.2_MB_(52.90%)

public class Solution {
    public String getPermutation(int n, int k) {
        char[] res = new char[n];
        // We want the permutation sequence to be zero-indexed
        k = k - 1;
        // The set bits indicate the available digits
        int a = (1 << n) - 1;
        int m = 1;
        for (int i = 2; i < n; i++) {
            // m = (n - 1)!
            m *= i;
        }
        for (int i = 0; i < n; i++) {
            int b = a;
            for (int j = 0; j < k / m; j++) {
                b &= b - 1;
            }
            // b is the bit corresponding to the digit we want
            b &= ~b + 1;
            res[i] = (char) ('1' + Integer.bitCount(b - 1));
            // Remove b from the set of available digits
            a &= ~b;
            k %= m;
            m /= Math.max(1, n - i - 1);
        }
        return String.valueOf(res);
    }
}
