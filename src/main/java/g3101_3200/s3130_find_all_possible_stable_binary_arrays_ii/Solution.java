package g3101_3200.s3130_find_all_possible_stable_binary_arrays_ii;

// #Hard #Dynamic_Programming #Prefix_Sum #2024_05_02_Time_3_ms_(100.00%)_Space_40.6_MB_(100.00%)

public class Solution {
    private static final int MOD = (int) 1e9 + 7;
    private static final int N = 1000;
    private static long[] factorial;
    private static long[] reverse;

    public int numberOfStableArrays(int zero, int one, int limit) {
        if (factorial == null) {
            factorial = new long[N + 1];
            reverse = new long[N + 1];
            factorial[0] = 1;
            reverse[0] = 1;
            long x = 1;
            for (int i = 1; i <= N; ++i) {
                x = (x * i) % MOD;
                factorial[i] = (int) x;
                reverse[i] = getInverse(x, MOD);
            }
        }
        long ans = 0;
        long[] s = new long[one + 1];
        int n = Math.min(zero, one) + 1;
        for (int groups0 = (zero + limit - 1) / limit; groups0 <= Math.min(zero, n); ++groups0) {
            long s0 = calc(groups0, zero, limit);
            for (int groups1 = Math.max(groups0 - 1, (one + limit - 1) / limit);
                    groups1 <= Math.min(groups0 + 1, one);
                    ++groups1) {
                long s1 = s[groups1] != 0 ? s[groups1] : (s[groups1] = calc(groups1, one, limit));
                ans = (ans + s0 * s1 * (groups1 == groups0 ? 2 : 1)) % MOD;
            }
        }
        return (int) ((ans + MOD) % MOD);
    }

    long calc(int groups, int x, int limit) {
        long s = 0;
        int sign = 1;
        for (int k = 0; k * limit <= x - groups && k <= groups; k++) {
            s = (s + (long) sign * comb(groups, k) * comb(x - k * limit - 1, groups - 1)) % MOD;
            sign *= -1;
        }
        return s;
    }

    public long comb(int n, int k) {
        return (factorial[n] * reverse[k] % MOD) * reverse[n - k] % MOD;
    }

    public long getInverse(long n, long mod) {
        long p = mod;
        long x = 1;
        long y = 0;
        while (p > 0) {
            long quotient = n / p;
            long remainder = n % p;
            long tempY = x - quotient * y;
            x = y;
            y = tempY;
            n = p;
            p = remainder;
        }
        return ((x % mod) + mod) % mod;
    }

    public long quickPower(long base, long power, long p) {
        long result = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                result = result * base % p;
            }
            power >>= 1;
            base = base * base % p;
        }
        return result;
    }
}
