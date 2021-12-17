package g0001_0100.s0028_implement_strstr;

// #Easy #Top_Interview_Questions #String #Two_Pointers #String_Matching

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null) {
            return 0;
        }
        int m = haystack.length();
        int n = needle.length();
        for (int start = 0; start < m - n + 1; start++) {
            if (haystack.substring(start, start + n).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}
