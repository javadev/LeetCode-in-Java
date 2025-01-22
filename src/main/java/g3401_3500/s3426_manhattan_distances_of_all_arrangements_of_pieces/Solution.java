package g3401_3500.s3426_manhattan_distances_of_all_arrangements_of_pieces;

// #Hard #Math #Combinatorics #2025_01_22_Time_20_(87.92%)_Space_40.82_(98.07%)

public class Solution {
    private long comb(long a, long b, long mod) {
        if (b > a) {
            return 0;
        }
        long numer = 1;
        long denom = 1;
        for (long i = 0; i < b; ++i) {
            numer = numer * (a - i) % mod;
            denom = denom * (i + 1) % mod;
        }
        long denomInv = 1;
        long exp = mod - 2;
        while (exp > 0) {
            if (exp % 2 > 0) {
                denomInv = denomInv * denom % mod;
            }
            denom = denom * denom % mod;
            exp /= 2;
        }
        return numer * denomInv % mod;
    }

    public int distanceSum(int m, int n, int k) {
        long res = 0;
        long mod = 1000000007;
        long base = comb((long) m * n - 2, k - 2L, mod);
        for (int d = 1; d < n; ++d) {
            res = (res + (long) d * (n - d) % mod * m % mod * m % mod) % mod;
        }
        for (int d = 1; d < m; ++d) {
            res = (res + (long) d * (m - d) % mod * n % mod * n % mod) % mod;
        }
        return (int) (res * base % mod);
    }
}
