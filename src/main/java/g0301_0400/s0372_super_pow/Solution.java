package g0301_0400.s0372_super_pow;

// #Medium #Math #Divide_and_Conquer

public class Solution {
    private static final int mod = 1337;

    public int superPow(int a, int[] b) {
        int phi = phi(mod);
        int arrMod = arrMod(b, phi);
        if (isGreaterOrEqual(b, phi)) {
            // Cycle has started
            // cycle starts at phi with length phi
            return exp(a % mod, phi + arrMod);
        }
        return exp(a % mod, arrMod);
    }

    private int phi(int n) {
        float result = n;
        for (int p = 2; p * p <= n; p++) {
            if (n % p > 0) {
                continue;
            }
            while (n % p == 0) {
                n /= p;
            }
            result *= (1.0 - (1.0 / (float) p));
        }
        if (n > 1) {
            // if starting n was also prime (so it was greater than sqrt(n))
            result *= (1.0 - (1.0 / (float) n));
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
                y = (y * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return y;
    }
}
