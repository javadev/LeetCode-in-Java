package g3401_3500.s3414_maximum_score_of_non_overlapping_intervals;

// #Hard #Array #Dynamic_Programming #Sorting #Binary_Search
// #2025_01_08_Time_64_(95.65%)_Space_74.80_(98.26%)

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
        final int n = intervals.size();
        final int[][] ns = new int[n][];
        int p = 0;
        for (List<Integer> li : intervals) {
            ns[p] = new int[] {li.get(0), li.get(1), li.get(2), p};
            p++;
        }
        int[][] dp1 = new int[n][0];
        long[] dp = new long[n];
        Arrays.sort(ns, (a, b) -> (a[0] - b[0]));
        for (int k = 0; k < 4; ++k) {
            int[][] dp3 = new int[n][];
            long[] dp2 = new long[n];
            dp3[n - 1] = new int[] {ns[n - 1][3]};
            dp2[n - 1] = ns[n - 1][2];
            for (int i = n - 2; i >= 0; --i) {
                int l = i + 1;
                int r = n - 1;
                while (l <= r) {
                    final int mid = (l + r) >> 1;
                    if (ns[mid][0] > ns[i][1]) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
                dp2[i] = ns[i][2] + (l < n ? dp[l] : 0);
                if (i + 1 < n && dp2[i + 1] > dp2[i]) {
                    dp2[i] = dp2[i + 1];
                    dp3[i] = dp3[i + 1];
                } else {
                    if (l < n) {
                        dp3[i] = new int[dp1[l].length + 1];
                        dp3[i][0] = ns[i][3];
                        for (int j = 0; j < dp1[l].length; ++j) {
                            dp3[i][j + 1] = dp1[l][j];
                        }
                        Arrays.sort(dp3[i]);
                    } else {
                        dp3[i] = new int[] {ns[i][3]};
                    }
                    if (i + 1 < n && dp2[i + 1] == dp2[i] && check(dp3[i], dp3[i + 1]) > 0) {
                        dp3[i] = dp3[i + 1];
                    }
                }
            }
            dp = dp2;
            dp1 = dp3;
        }
        return dp1[0];
    }

    private int check(final int[] ns1, final int[] ns2) {
        int i = 0;
        while (i < ns1.length && i < ns2.length) {
            if (ns1[i] < ns2[i]) {
                return -1;
            } else if (ns1[i] > ns2[i]) {
                return 1;
            }
            i++;
        }
        return 0;
    }
}
