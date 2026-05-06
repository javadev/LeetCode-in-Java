package g3701_3800.s3777_minimum_deletions_to_make_alternating_substring;

// #Hard #String #Segment_Tree #Senior_Staff #Weekly_Contest_480
// #2026_05_06_Time_35_ms_(100.00%)_Space_247.99_MB_(90.00%)

import java.util.Arrays;

public class Solution {
    private int[] f;
    private int n;

    private void add(int i, int v) {
        for (i++; i <= n; i += i & -i) {
            f[i] += v;
        }
    }

    private int sum(int i) {
        int s = 0;
        for (i++; i > 0; i -= i & -i) {
            s += f[i];
        }
        return s;
    }

    public int[] minDeletions(String s, int[][] q) {
        char[] a = s.toCharArray();
        n = a.length;
        f = new int[n + 1];
        for (int i = 0; i + 1 < n; i++) {
            if (a[i] == a[i + 1]) {
                add(i, 1);
            }
        }
        int[] ans = new int[q.length];
        int k = 0;
        for (int[] e : q) {
            if (e[0] == 1) {
                int j = e[1];
                if (j > 0 && a[j] == a[j - 1]) {
                    add(j - 1, -1);
                }
                if (j + 1 < n && a[j] == a[j + 1]) {
                    add(j, -1);
                }
                a[j] = a[j] == 'A' ? 'B' : 'A';
                if (j > 0 && a[j] == a[j - 1]) {
                    add(j - 1, 1);
                }
                if (j + 1 < n && a[j] == a[j + 1]) {
                    add(j, 1);
                }
            } else {
                int l = e[1];
                int r = e[2];
                ans[k++] = l < r ? sum(r - 1) - sum(l - 1) : 0;
            }
        }
        return Arrays.copyOf(ans, k);
    }
}
