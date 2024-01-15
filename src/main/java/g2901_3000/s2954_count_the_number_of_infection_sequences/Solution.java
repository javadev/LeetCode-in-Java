package g2901_3000.s2954_count_the_number_of_infection_sequences;

// #Hard #Array #Math #Combinatorics #2024_01_15_Time_11_ms_(99.61%)_Space_46.3_MB_(29.46%)

public class Solution {
    private final int m = 100000;
    private final long[] fact = new long[m + 1];
    private final long[] invFact = new long[m + 1];
    private final int mod = 1000000007;
    private long init = 0;

    private int modPow(int x, int y, int mod) {
        if (y == 0) {
            return 1;
        }
        long p = modPow(x, y / 2, mod) % mod;
        p = (p * p) % mod;
        return y % 2 == 1 ? (int) (p * x % mod) : (int) p;
    }

    private long binomCoeff(int n, int k) {
        return Math.max(1L, fact[n] * invFact[k] % mod * invFact[n - k] % mod);
    }

    public int numberOfSequence(int n, int[] sick) {
        if (init == 0) {
            init = 1;
            fact[0] = 1;
            for (int i = 1; i <= m; ++i) {
                fact[i] = fact[i - 1] * i % mod;
            }
            invFact[m] = modPow((int) fact[m], mod - 2, mod);
            for (int i = m - 1; i > 0; --i) {
                invFact[i] = invFact[i + 1] * (i + 1) % mod;
            }
        }
        long res = 1;
        for (int i = 1; i < sick.length; ++i) {
            int group = sick[i] - sick[i - 1] - 1;
            res = res * modPow(2, Math.max(0, group - 1), mod) % mod;
            res = res * binomCoeff(sick[i] - i, group) % mod;
        }
        return (int) (res * binomCoeff(n - sick.length, n - sick[sick.length - 1] - 1) % mod);
    }
}
