package g0001_0100.s0028_implement_strstr;

// #Easy #Top_Interview_Questions #String #Two_Pointers #String_Matching
// #2022_02_21_Time_12_ms_(89.40%)_Space_42.8_MB_(39.70%)

public class Solution {
    public int strStr(String haystack, String needle) {
        int idx = -1;
        if (needle.isEmpty()) {
            return 0;
        }
        int n = haystack.length();
        int m = needle.length();
        int i = 0;
        int j = 0;
        int[] lps = new int[m];
        preprocessPattern(needle, m, lps);
        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                idx = (i - j);
                break;
            } else if (i < n && haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return idx;
    }

    private void preprocessPattern(String needle, int m, int[] lps) {
        int l = 0;
        int i = 1;
        lps[0] = 0;
        while (i < m) {
            if (needle.charAt(i) == needle.charAt(l)) {
                l++;
                lps[i] = l;
                i++;
            } else {
                if (l != 0) {
                    l = lps[l - 1];
                } else {
                    lps[i] = l;
                    i++;
                }
            }
        }
    }
}
