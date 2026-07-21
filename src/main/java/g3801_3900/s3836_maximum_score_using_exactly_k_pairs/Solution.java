package g3801_3900.s3836_maximum_score_using_exactly_k_pairs;

// #Hard #Array #Dynamic_Programming #Senior_Staff #Weekly_Contest_488
// #2026_07_21_Time_117_ms_(91.80%)_Space_47.04_MB_(98.36%)

import java.util.Arrays;

@SuppressWarnings("java:S2234")
public class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        final int n = nums1.length;
        final int m = nums2.length;
        final long negINF = -1_000_000_000_000_000L;
        if (n < m) {
            return maxScore(nums2, nums1, k);
        }
        long[][] curr = new long[m + 1][k + 1];
        long[][] prev = new long[m + 1][k + 1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(prev[i], negINF);
            prev[i][0] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (long[] row : curr) {
                Arrays.fill(row, negINF);
                row[0] = 0;
            }
            for (int j = 1; j <= m; j++) {
                for (int p = 1; p <= k; p++) {
                    long option1 = (long) nums1[i - 1] * nums2[j - 1] + prev[j - 1][p - 1];
                    long option2 = prev[j][p];
                    long option3 = curr[j - 1][p];
                    curr[j][p] = Math.max(option1, Math.max(option2, option3));
                }
            }
            long[][] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prev[m][k];
    }
}
