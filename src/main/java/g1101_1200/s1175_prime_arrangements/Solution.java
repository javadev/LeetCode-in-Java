package g1101_1200.s1175_prime_arrangements;

// #Easy #Math #2022_03_05_Time_6_ms_(10.00%)_Space_42.1_MB_(5.71%)

import java.math.BigInteger;
import java.util.Arrays;

public class Solution {
    static int mod = 1000000007;

    public int numPrimeArrangements(int n) {
        int numberOfPrimes = generatePrimes(n);
        BigInteger x = factorial(numberOfPrimes);
        BigInteger y = factorial(n - numberOfPrimes);
        return x.multiply(y).mod(BigInteger.valueOf(mod)).intValue();
    }

    private BigInteger factorial(int n) {
        BigInteger fac = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac.mod(BigInteger.valueOf(mod));
    }

    private int generatePrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, 2, n + 1, true);
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for (boolean b : prime) {
            if (b) {
                count++;
            }
        }

        return count;
    }
}
