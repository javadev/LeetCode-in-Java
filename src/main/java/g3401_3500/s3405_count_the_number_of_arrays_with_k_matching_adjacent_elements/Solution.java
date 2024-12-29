package g3401_3500.s3405_count_the_number_of_arrays_with_k_matching_adjacent_elements;

// #Hard #2024_12_29_Time_57_(100.00%)_Space_44.55_(100.00%)

public class Solution {
    private final int mod = (int) (1e9 + 7);

    public int countGoodArrays(int n, int m, int k) {
        long[] f = new long[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = (f[i - 1] * i % mod);
        }
        long ans = comb(n - 1, k, f);
        ans = ans * m % mod;
        ans = ans * ex(m - 1, n - k - 1) % mod;
        return (int) ans;
    }

    private long ex(long b, long e) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1) {
                ans = (ans * b) % mod;
            }
            b = (b * b) % mod;
            e = e >> 1;
        }
        return ans;
    }

    private long comb(int n, int r, long[] f) {
        return f[n] * (ff(f[r])) % mod * ff(f[n - r]) % mod;
    }

    private long ff(long x) {
        return ex(x, mod - 2);
    }
}
