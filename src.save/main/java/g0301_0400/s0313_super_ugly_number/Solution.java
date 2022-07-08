package g0301_0400.s0313_super_ugly_number;

// #Medium #Array #Dynamic_Programming #Math #2022_07_08_Time_19_ms_(91.86%)_Space_43.3_MB_(41.31%)

public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] primes1 = new long[primes.length];
        for (int i = 0; i < primes.length; i++) {
            primes1[i] = primes[i];
        }
        int[] index = new int[primes.length];
        long[] n1 = new long[n];
        n1[0] = 1L;
        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;
            for (int j = 0; j < primes1.length; j++) {
                min = Math.min(min, primes1[j]);
            }
            n1[i] = min;
            for (int j = 0; j < primes1.length; j++) {
                if (min == primes1[j]) {
                    primes1[j] *= n1[++index[j]];
                }
            }
        }
        return (int) n1[n - 1];
    }
}
