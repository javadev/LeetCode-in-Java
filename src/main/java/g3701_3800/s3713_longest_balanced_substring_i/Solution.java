package g3701_3800.s3713_longest_balanced_substring_i;

// #Medium #Weekly_Contest_471 #2025_10_13_Time_34_ms_(99.73%)_Space_45.52_MB_(50.00%)

public class Solution {
    public int longestBalanced(String s) {
        final int n = s.length();
        int r = 0;
        for (int i = 0; i < n; ++i) {
            int[] f = new int[26];
            int k = 0;
            int m = 0;
            for (int j = i; j < n; ++j) {
                int x = s.charAt(j) - 'a';
                if (++f[x] == 1) {
                    ++k;
                }
                m = Math.max(f[x], m);
                if (m * k == j - i + 1) {
                    r = Math.max(r, j - i + 1);
                }
            }
        }
        return r;
    }
}
