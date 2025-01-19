package g3401_3500.s3426_manhattan_distances_of_all_arrangements_of_pieces;

// #Hard #2025_01_19_Time_20_(100.00%)_Space_41.18_(100.00%)

public class Solution {
    private long comb(long a, long b, long mod) {
        if (b > a) return 0;
        long numer = 1, denom = 1;
        for (long i = 0; i < b; ++i) {
            numer = numer * (a - i) % mod;
            denom = denom * (i + 1) % mod;
        }
        long denom_inv = 1;
        long exp = mod - 2;
        while (exp > 0) {
            if (exp % 2 > 0) {
                denom_inv = denom_inv * denom % mod;
            }
            denom = denom * denom % mod;
            exp /= 2;
        }
        return numer * denom_inv % mod;
    }

    public int distanceSum(int m, int n, int k) {
        long res = 0, mod = 1000000007;
        long base = comb((long) m * n - 2, k - 2, mod);
        for (int d = 1; d < n; ++d) {
            res = (res + (long) d * (n - d) % mod * m % mod * m % mod) % mod;
        }
        for (int d = 1; d < m; ++d) {
            res = (res + (long) d * (m - d) % mod * n % mod * n % mod) % mod;
        }
        return (int) (res * base % mod);
    }
}
