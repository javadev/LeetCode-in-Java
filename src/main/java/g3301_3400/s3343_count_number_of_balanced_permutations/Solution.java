package g3301_3400.s3343_count_number_of_balanced_permutations;

// #Hard #2024_11_05_Time_61_ms_(97.56%)_Space_44.3_MB_(100.00%)

public class Solution {
    private static final int M = 1000000007;

    public int countBalancedPermutations(String n) {
        int l = n.length();
        int ts = 0;
        int[] c = new int[10];
        for (char d : n.toCharArray()) {
            c[d - '0']++;
            ts += d - '0';
        }
        if (ts % 2 != 0) {
            return 0;
        }
        int hs = ts / 2;
        int m = (l + 1) / 2;
        long[] f = new long[l + 1];
        f[0] = 1;
        for (int i = 1; i <= l; i++) {
            f[i] = f[i - 1] * i % M;
        }
        long[] invF = new long[l + 1];
        invF[l] = modInverse(f[l], M);
        for (int i = l - 1; i >= 0; i--) {
            invF[i] = invF[i + 1] * (i + 1) % M;
        }
        long[][] dp = new long[m + 1][hs + 1];
        dp[0][0] = 1;
        for (int d = 0; d <= 9; d++) {
            if (c[d] == 0) {
                continue;
            }
            for (int k = m; k >= 0; k--) {
                for (int s = hs; s >= 0; s--) {
                    if (dp[k][s] == 0) {
                        continue;
                    }
                    for (int t = 1; t <= c[d] && k + t <= m && s + d * t <= hs; t++) {
                        dp[k + t][s + d * t] =
                                (dp[k + t][s + d * t] + dp[k][s] * comb(c[d], t, f, invF, M)) % M;
                    }
                }
            }
        }
        long w = dp[m][hs];
        long r = f[m] * f[l - m] % M;
        for (int d = 0; d <= 9; d++) {
            r = r * invF[c[d]] % M;
        }
        r = r * w % M;
        return (int) r;
    }

    private long modInverse(long a, int m) {
        long r = 1;
        long p = m - 2L;
        long b = a;
        while (p > 0) {
            if ((p & 1) == 1) {
                r = r * b % m;
            }
            b = b * b % m;
            p >>= 1;
        }
        return r;
    }

    private long comb(int n, int k, long[] f, long[] invF, int m) {
        if (k > n) {
            return 0;
        }
        return f[n] * invF[k] % m * invF[n - k] % m;
    }
}
