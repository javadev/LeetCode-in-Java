package g4001_4100.s4002_count_valid_sequences;

// #Medium #Math #Combinatorics #Staff #Weekly_Contest_512
// #2026_11_17_Time_8_ms_(96.61%)_Space_42.35_MB_(61.02%)

public class Solution {
    private static final int MOD = 1000000007;

    private long power(long b, long e) {
        long r = 1;
        for (; e > 0; e >>= 1, b = b * b % MOD) {
            if ((e & 1) == 1) {
                r = r * b % MOD;
            }
        }
        return r;
    }

    private long comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        k = Math.min(k, n - k);
        long res = 1, den = 1;
        for (int i = 1; i <= k; ++i) {
            res = res * (n - i + 1) % MOD;
            den = den * i % MOD;
        }
        return res * power(den, MOD - 2) % MOD;
    }

    public int countValidSequences(int n, int k) {
        long res = comb(n - 1, k - 1);
        if (n % 2 == k % 2) {
            res = (res - comb((n + k) / 2 - 1, k - 1) + MOD) % MOD;
        }
        return (int) res;
    }
}
