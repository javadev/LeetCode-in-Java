package g3201_3300.s3225_maximum_score_from_grid_operations;

// #Hard #Array #Dynamic_Programming #Matrix #Prefix_Sum
// #2024_07_23_Time_21_ms_(100.00%)_Space_45.1_MB_(96.92%)

public class Solution {
    public long maximumScore(int[][] grid) {
        final int n = grid.length;
        long[] dp1 = new long[n];
        long[] dp2 = new long[n + 1];
        long[] dp3 = new long[n + 1];
        long[] dp12 = new long[n];
        long[] dp22 = new long[n + 1];
        long[] dp32 = new long[n + 1];
        long res = 0;
        for (int i = 0; i < n; ++i) {
            long sum = 0, pre = 0;
            for (int j = 0; j < n; ++j) {
                sum += grid[j][i];
            }
            for (int j = n - 1; j >= 0; --j) {
                long s2 = sum;
                dp12[j] = s2 + dp3[n];
                for (int k = 0; k <= j; ++k) {
                    s2 -= grid[k][i];
                    long v = Math.max(dp1[k] + s2, dp3[j] + s2);
                    v = Math.max(v, pre + s2);
                    dp12[j] = Math.max(dp12[j], v);
                    if (k == j) {
                        dp22[j] = dp32[j] = v;
                        res = Math.max(res, v);
                    }
                }
                if (i > 0) {
                    pre = Math.max(pre + grid[j][i], dp2[j] + grid[j][i]);
                }
                sum -= grid[j][i];
            }
            dp22[n] = dp32[n] = pre;
            res = Math.max(res, pre);
            for (int j = 1; j <= n; ++j) {
                dp32[j] = Math.max(dp32[j], dp32[j - 1]);
            }
            long[] tem = dp1;
            dp1 = dp12;
            dp12 = tem;
            tem = dp2;
            dp2 = dp22;
            dp22 = tem;
            tem = dp3;
            dp3 = dp32;
            dp32 = tem;
        }
        return res;
    }
}
