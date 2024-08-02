package g3201_3300.s3233_find_the_count_of_numbers_which_are_not_special;

// #Medium #Array #Math #Number_Theory #2024_08_02_Time_20_ms_(70.12%)_Space_44.6_MB_(17.28%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int nonSpecialCount(int l, int r) {
        List<Integer> primes = sieveOfEratosthenes((int) Math.sqrt(r));
        int specialCount = 0;

        for (Integer prime : primes) {
            long primeSquare = (long) prime * prime;
            if (primeSquare >= l && primeSquare <= r) {
                specialCount++;
            }
        }

        int totalNumbersInRange = r - l + 1;
        return totalNumbersInRange - specialCount;
    }

    private List<Integer> sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
