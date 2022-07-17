package g0301_0400.s0313_super_ugly_number;

// #Medium #Array #Dynamic_Programming #Math #2022_07_10_Time_16_ms_(96.57%)_Space_42.3_MB_(64.43%)

@SuppressWarnings("java:S3012")
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
            for (long l : primes1) {
                min = Math.min(min, l);
            }
            n1[i] = min;
            for (int j = 0; j < primes1.length; j++) {
                if (min == primes1[j]) {
                    primes1[j] = primes[j] * (n1[++index[j]]);
                }
            }
        }
        return (int) n1[n - 1];
    }
}
