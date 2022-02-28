package g0301_0400.s0392_is_subsequence;

// #Easy #String #Dynamic_Programming #Two_Pointers

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int n = t.length();
        int m = s.length();
        if (m == 0) {
            return true;
        }
        while (j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                if (i == m) {
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}
