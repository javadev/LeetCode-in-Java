package g3501_3600.s3539_find_sum_of_array_product_of_magical_sequences;

// #Hard #2025_05_04_Time_39_ms_(97.56%)_Space_44.79_MB_(87.80%)

import java.util.Arrays;

public class Solution {
    private static final int MOD = 1_000_000_007;
    private static final int[][] C = precomputeBinom(31);
    private static final int[] P = precomputePop(31);

    public int magicalSum(int m, int k, int[] nums) {
        int n = nums.length;
        long[][] pow = new long[n][m + 1];
        for (int j = 0; j < n; j++) {
            pow[j][0] = 1L;
            for (int c = 1; c <= m; c++) {
                pow[j][c] = pow[j][c - 1] * nums[j] % MOD;
            }
        }
        long[][][] dp = new long[m + 1][k + 1][m + 1];
        long[][][] next = new long[m + 1][k + 1][m + 1];
        dp[0][0][0] = 1L;
        for (int i = 0; i < n; i++) {
            for (int t = 0; t <= m; t++) {
                for (int o = 0; o <= k; o++) {
                    Arrays.fill(next[t][o], 0L);
                }
            }
            for (int t = 0; t <= m; t++) {
                for (int o = 0; o <= k; o++) {
                    for (int c = 0; c <= m; c++) {
                        if (dp[t][o][c] == 0) {
                            continue;
                        }
                        for (int cc = 0; cc <= m - t; cc++) {
                            int total = c + cc;
                            if (o + (total & 1) > k) {
                                continue;
                            }
                            next[t + cc][o + (total & 1)][total >>> 1] =
                                    (next[t + cc][o + (total & 1)][total >>> 1]
                                                    + dp[t][o][c]
                                                            * C[m - t][cc]
                                                            % MOD
                                                            * pow[i][cc]
                                                            % MOD)
                                            % MOD;
                        }
                    }
                }
            }
            long[][][] tmp = dp;
            dp = next;
            next = tmp;
        }
        long res = 0;
        for (int o = 0; o <= k; o++) {
            for (int c = 0; c <= m; c++) {
                if (o + P[c] == k) {
                    res = (res + dp[m][o][c]) % MOD;
                }
            }
        }
        return (int) res;
    }

    private static int[][] precomputeBinom(int max) {
        int[][] res = new int[max][max];
        for (int i = 0; i < max; i++) {
            res[i][0] = res[i][i] = 1;
            for (int j = 1; j < i; j++) {
                res[i][j] = (res[i - 1][j - 1] + res[i - 1][j]) % MOD;
            }
        }
        return res;
    }

    private static int[] precomputePop(int max) {
        int[] res = new int[max];
        for (int i = 1; i < max; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }
}
