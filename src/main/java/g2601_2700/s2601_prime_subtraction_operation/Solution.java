package g2601_2700.s2601_prime_subtraction_operation;

// #Medium #Array #Math #Greedy #Binary_Search #Number_Theory
// #2023_08_29_Time_2_ms_(100.00%)_Space_43.9_MB_(39.47%)

import java.util.Arrays;

public class Solution {
    private int[] primesUntil(int n) {
        if (n < 2) {
            return new int[0];
        }
        int[] primes = new int[200];
        boolean[] composite = new boolean[n + 1];
        primes[0] = 2;
        int added = 1;
        int i = 3;
        while (i <= n) {
            if (composite[i]) {
                i += 2;
                continue;
            }
            primes[added++] = i;
            int j = i * i;
            while (j <= n) {
                composite[j] = true;
                j += i;
            }
            i += 2;
        }
        return Arrays.copyOf(primes, added);
    }

    public boolean primeSubOperation(int[] nums) {
        int max = 0;
        for (int n : nums) {
            max = Math.max(max, n);
        }
        int[] primes = primesUntil(max);
        int prev = 0;
        for (int n : nums) {
            int pos = Arrays.binarySearch(primes, n - prev - 1);
            if (pos == -1 && n <= prev) {
                return false;
            }
            final int index;
            if (pos == -1) {
                index = 0;
            } else {
                index = pos < 0 ? primes[-pos - 2] : primes[pos];
            }
            prev = n - index;
        }
        return true;
    }
}
