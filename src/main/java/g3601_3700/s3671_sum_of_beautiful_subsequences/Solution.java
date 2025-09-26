package g3601_3700.s3671_sum_of_beautiful_subsequences;

// #Hard #Array #Math #Tree #Number_Theory #Weekly_Contest_465
// #2025_09_26_Time_232_ms_(92.27%)_Space_56.32_MB_(82.85%)

public class Solution {
    private static final int MOD = 1000000007;

    public int totalBeauty(int[] nums) {
        int maxV = 0;
        for (int v : nums) {
            if (v > maxV) {
                maxV = v;
            }
        }
        // index by g
        Fenwick[] fenwicks = new Fenwick[maxV + 1];
        // FDiv[g] = # inc subseq with all elements multiple of g
        long[] fDiv = new long[maxV + 1];
        // temp buffer for divisors (max divisors of any number <= ~128 for this constraint)
        int[] divisors = new int[256];
        // Left-to-right DP restricted to multiples of each divisor g
        for (int x : nums) {
            int cnt = 0;
            int r = (int) Math.sqrt(x);
            for (int d = 1; d <= r; d++) {
                if (x % d == 0) {
                    divisors[cnt++] = d;
                    int d2 = x / d;
                    if (d2 != d) {
                        divisors[cnt++] = d2;
                    }
                }
            }
            for (int i = 0; i < cnt; i++) {
                int g = divisors[i];
                // coordinate in [1..maxV/g] for this g
                int idxQ = x / g;
                Fenwick fw = fenwicks[g];
                if (fw == null) {
                    // size needs to be >= max index (maxV/g). Use +2 for safety and 1-based
                    // indexing.
                    fw = new Fenwick(maxV / g + 2);
                    fenwicks[g] = fw;
                }
                long dp = 1 + fw.query(idxQ - 1);
                if (dp >= MOD) {
                    dp -= MOD;
                }
                fw.add(idxQ, dp);
                fDiv[g] += dp;
                if (fDiv[g] >= MOD) {
                    fDiv[g] -= MOD;
                }
            }
        }
        // Inclusion–exclusion to get exact gcd counts
        long[] exact = new long[maxV + 1];
        for (int g = maxV; g >= 1; g--) {
            long s = fDiv[g];
            for (int m = g + g; m <= maxV; m += g) {
                s -= exact[m];
                if (s < 0) {
                    s += MOD;
                }
            }
            exact[g] = s;
        }
        long ans = 0;
        for (int g = 1; g <= maxV; g++) {
            if (exact[g] != 0) {
                ans += exact[g] * g % MOD;
                if (ans >= MOD) {
                    ans -= MOD;
                }
            }
        }
        return (int) ans;
    }

    private static final class Fenwick {
        private final long[] tree;

        Fenwick(int size) {
            this.tree = new long[size];
        }

        void add(int indexOneBased, long delta) {
            for (int i = indexOneBased; i < tree.length; i += i & -i) {
                long v = tree[i] + delta;
                if (v >= MOD) {
                    v -= MOD;
                }
                tree[i] = v;
            }
        }

        long query(int indexOneBased) {
            long sum = 0;
            for (int i = indexOneBased; i > 0; i -= i & -i) {
                sum += tree[i];
                if (sum >= MOD) {
                    sum -= MOD;
                }
            }
            return sum;
        }
    }
}
