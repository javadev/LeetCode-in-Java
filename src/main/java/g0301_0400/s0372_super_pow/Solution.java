package g0301_0400.s0372_super_pow;

// #Medium #Math #Divide_and_Conquer #2022_07_12_Time_1_ms_(100.00%)_Space_42.4_MB_(87.15%)

public class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        int phi = phi(MOD);
        int arrMod = arrMod(b, phi);
        if (isGreaterOrEqual(b, phi)) {
            // Cycle has started
            // cycle starts at phi with length phi
            return exp(a % MOD, phi + arrMod);
        }
        return exp(a % MOD, arrMod);
    }

    private int phi(int n) {
        double result = n;
        for (int p = 2; p * p <= n; p++) {
            if (n % p > 0) {
                continue;
            }
            while (n % p == 0) {
                n /= p;
            }
            result *= 1.0 - 1.0 / p;
        }
        if (n > 1) {
            // if starting n was also prime (so it was greater than sqrt(n))
            result *= (1.0 - (1.0 / n));
        }
        return (int) result;
    }

    // Returns true if number in array is greater than integer named phi
    private boolean isGreaterOrEqual(int[] b, int phi) {
        int cur = 0;
        for (int j : b) {
            cur = cur * 10 + j;
            if (cur >= phi) {
                return true;
            }
        }
        return false;
    }

    // Returns number in array mod phi
    private int arrMod(int[] b, int phi) {
        int res = 0;
        for (int j : b) {
            res = (res * 10 + j) % phi;
        }
        return res;
    }

    // Binary exponentiation
    private int exp(int a, int b) {
        int y = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                y = (y * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return y;
    }
}
