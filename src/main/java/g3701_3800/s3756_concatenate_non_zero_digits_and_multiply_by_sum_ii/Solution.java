package g3701_3800.s3756_concatenate_non_zero_digits_and_multiply_by_sum_ii;

// #Medium #String #Math #Prefix_Sum #Staff #Weekly_Contest_477
// #2026_04_25_Time_14_ms_(100.00%)_Space_131.16_MB_(32.94%)

public class Solution {
    private static final long MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int m = s.length();
        long[] p = new long[m + 1];
        long[] sum = new long[m + 1];
        int[] cnt = new int[m + 1];
        long[] pow10 = new long[m + 1];
        pow10[0] = 1;
        for (int i = 0; i < m; i++) {
            int d = s.charAt(i) - '0';
            if (d != 0) {
                p[i + 1] = (p[i] * 10 + d) % MOD;
            } else {
                p[i + 1] = p[i];
            }
            sum[i + 1] = sum[i] + d;
            cnt[i + 1] = cnt[i] + (d != 0 ? 1 : 0);
            pow10[i + 1] = pow10[i] * 10 % MOD;
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int k = cnt[r + 1] - cnt[l];
            long x = (p[r + 1] - p[l] * pow10[k] % MOD + MOD) % MOD;
            long digitSum = sum[r + 1] - sum[l];
            ans[i] = (int) (x * digitSum % MOD);
        }
        return ans;
    }
}
