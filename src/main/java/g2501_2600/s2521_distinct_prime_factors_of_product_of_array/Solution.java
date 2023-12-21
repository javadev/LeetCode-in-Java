package g2501_2600.s2521_distinct_prime_factors_of_product_of_array;

// #Medium #Array #Hash_Table #Math #Number_Theory
// #2023_04_18_Time_2_ms_(100.00%)_Space_44.1_MB_(18.47%)

@SuppressWarnings("java:S1119")
public class Solution {
    static final int[] PRIMES = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

    public int distinctPrimeFactors(int[] nums) {
        final boolean[] hasPrime = new boolean[PRIMES.length];
        final boolean[] nr = new boolean[1001];
        int r = 0;
        a:
        for (int n : nums) {
            if (nr[n]) {
                continue;
            }
            nr[n] = true;
            for (int i = 0; i < PRIMES.length && n > 1; i++) {
                final int prime = PRIMES[i];
                while (n % prime == 0) {
                    n /= prime;
                    hasPrime[i] = true;
                    if (nr[n]) {
                        continue a;
                    }
                    nr[n] = true;
                }
            }
            if (n > 1) {
                r++;
            }
        }
        for (boolean p : hasPrime) {
            if (p) {
                r++;
            }
        }
        return r;
    }
}
