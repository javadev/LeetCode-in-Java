package g3401_3500.s3405_count_the_number_of_arrays_with_k_matching_adjacent_elements;

// #Hard #Math #Combinatorics #2025_01_06_Time_55_ms_(52.53%)_Space_44.95_MB_(37.58%)

public class Solution {
    private static final int MOD = (int) (1e9 + 7);

    public int countGoodArrays(int n, int m, int k) {
        long[] f = new long[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = (f[i - 1] * i % MOD);
        }
        long ans = comb(n - 1, k, f);
        ans = ans * m % MOD;
        ans = ans * ex(m - 1L, n - k - 1L) % MOD;
        return (int) ans;
    }

    private long ex(long b, long e) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1) {
                ans = (ans * b) % MOD;
            }
            b = (b * b) % MOD;
            e = e >> 1;
        }
        return ans;
    }

    private long comb(int n, int r, long[] f) {
        return f[n] * (ff(f[r])) % MOD * ff(f[n - r]) % MOD;
    }

    private long ff(long x) {
        return ex(x, MOD - 2L);
    }
}
