package g3601_3700.s3639_minimum_time_to_activate_string;

// #Medium #Array #Binary_Search #Weekly_Contest_461
// #2025_08_14_Time_6_ms_(99.91%)_Space_57.07_MB_(91.05%)

public class Solution {
    public int minTime(String s, int[] order, int k) {
        int n = s.length();
        long total = n * (n + 1L) / 2;
        if (total < k) {
            return -1;
        }
        int[] prev = new int[n + 1];
        int[] next = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            prev[i] = i - 1;
            next[i] = i + 1;
        }
        for (int t = n - 1; t >= 0; t--) {
            int i = order[t];
            int left = prev[i];
            int right = next[i];
            total -= (long) (i - left) * (right - i);
            if (total < k) {
                return t;
            }
            if (left >= 0) {
                next[left] = right;
            }
            prev[right] = left;
        }
        return 0;
    }
}
