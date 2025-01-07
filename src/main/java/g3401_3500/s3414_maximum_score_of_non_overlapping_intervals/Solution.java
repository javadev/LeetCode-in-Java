package g3401_3500.s3414_maximum_score_of_non_overlapping_intervals;

// #Hard #Array #Dynamic_Programming #Sorting #Binary_Search
// #2025_01_07_Time_63_(94.92%)_Space_88.95_(71.19%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        int[][] arr = new int[n][4];
        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals.get(i).get(0);
            arr[i][1] = intervals.get(i).get(1);
            arr[i][2] = intervals.get(i).get(2);
            arr[i][3] = i;
        }
        Arrays.sort(arr, (a, b) -> Long.compare(a[1], b[1]));
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            int l = 0, r = i - 1;
            while (l <= r) {
                int m = (l + r) >>> 1;
                if (arr[m][1] < arr[i][0]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            p[i] = r;
        }

        class S {
            long sum;
            int[] x;

            S(long s, int[] t) {
                sum = s;
                x = t;
            }
        }

        S base = new S(0, new int[0]);
        S[][] dp = new S[n][5];
        Comparator<S> cmp =
                (a, b) -> {
                    if (a.sum != b.sum) {
                        return a.sum > b.sum ? -1 : 1;
                    }
                    for (int i = 0; i < Math.min(a.x.length, b.x.length); i++) {
                        if (a.x[i] != b.x[i]) {
                            return a.x[i] < b.x[i] ? -1 : 1;
                        }
                    }
                    return Integer.compare(a.x.length, b.x.length);
                };

        for (int i = 0; i < n; i++) {
            dp[i][0] = base;
            for (int k = 1; k <= 4; k++) {
                S no = (i > 0) ? dp[i - 1][k] : base;
                long pickVal = arr[i][2] + ((p[i] >= 0) ? dp[p[i]][k - 1].sum : 0);
                int[] pickPath;
                if (p[i] >= 0) {
                    pickPath = merge(dp[p[i]][k - 1].x, arr[i][3]);
                } else {
                    pickPath = new int[] {arr[i][3]};
                }
                S pick = new S(pickVal, pickPath);
                dp[i][k] = (cmp.compare(no, pick) <= 0) ? no : pick;
            }
        }
        S ans = base;
        for (int k = 1; k <= 4; k++) {
            S candidate = dp[n - 1][k];
            if (ans.sum < candidate.sum) {
                ans = candidate;
            } else if (ans.sum == candidate.sum && cmp.compare(ans, candidate) > 0) {
                ans = candidate;
            }
        }
        Arrays.sort(ans.x);
        return ans.x;
    }

    private int[] merge(int[] a, int v) {
        int[] r = new int[a.length + 1];
        System.arraycopy(a, 0, r, 0, a.length);
        r[a.length] = v;
        return r;
    }
}
