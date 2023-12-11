package g2501_2600.s2565_subsequence_with_the_minimum_score;

// #Hard #String #Binary_Search #Two_Pointers #2023_08_21_Time_7_ms_(92.54%)_Space_44.4_MB_(44.78%)

public class Solution {
    public int minimumScore(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[] left = new int[m];
        int j = 0;
        for (int i = 0; i < m; i++) {
            if (j < n && s.charAt(i) == t.charAt(j)) {
                ++j;
            }
            left[i] = j;
        }
        int[] right = new int[m];
        j = n - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (j >= 0 && s.charAt(i) == t.charAt(j)) {
                --j;
            }
            right[i] = j;
        }
        int min = Math.min(n - left[m - 1], right[0] + 1);
        for (int i = 0; i + 1 < m; i++) {
            min = Math.min(min, Math.max(0, right[i + 1] - left[i] + 1));
        }
        return min;
    }
}
