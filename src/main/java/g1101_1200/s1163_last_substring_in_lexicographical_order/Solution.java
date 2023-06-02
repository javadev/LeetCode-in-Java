package g1101_1200.s1163_last_substring_in_lexicographical_order;

// #Hard #String #Two_Pointers #2023_06_02_Time_10_ms_(97.22%)_Space_45.5_MB_(83.33%)

public class Solution {
    public String lastSubstring(String s) {
        int i = 0;
        int j = 1;
        int k = 0;
        int n = s.length();
        char[] ca = s.toCharArray();
        while (j + k < n) {
            if (ca[i + k] == ca[j + k]) {
                k++;
            } else if (ca[i + k] > ca[j + k]) {
                j = j + k + 1;
                k = 0;
            } else {
                i = Math.max(i + k + 1, j);
                j = i + 1;
                k = 0;
            }
        }
        return s.substring(i);
    }
}
