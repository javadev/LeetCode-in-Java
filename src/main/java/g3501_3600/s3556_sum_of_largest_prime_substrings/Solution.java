package g3501_3600.s3556_sum_of_largest_prime_substrings;

// #Medium #2025_05_25_Time_21_ms_(100.00%)_Space_42.82_MB_(100.00%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public long sumOfLargestPrimes(String s) {
        Set<Long> primeSet = new HashSet<>();
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            long temp = 0;
            for (int j = i; j < n; ++j) {
                temp = temp * 10 + (s.charAt(j) - '0');
                if (isPrime(temp)) {
                    primeSet.add(temp);
                }
            }
        }
        List<Long> primes = new ArrayList<>(primeSet);
        Collections.sort(primes);
        int m = primes.size();
        if (m < 3) {
            long sum = 0;
            for (long p : primes) {
                sum += p;
            }
            return sum;
        }
        return primes.get(m - 1) + primes.get(m - 2) + primes.get(m - 3);
    }

    private boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (long i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
