package g3201_3300.s3290_maximum_multiplication_score;

// #Medium #2024_09_16_Time_8_ms_(100.00%)_Space_62.5_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public long maxScore(int[] a, int[] b) {
        long[] dp = new long[4];
        Arrays.fill(dp, (long) -1e11);
        for (int bi : b) {
            for (int i = 3; i >= 0; i--) {
                dp[i] = Math.max(dp[i], (i > 0 ? dp[i - 1] : 0) + (long) a[i] * bi);
            }
        }
        return dp[3];
    }
}
