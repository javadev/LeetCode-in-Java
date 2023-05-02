package g1101_1200.s1163_last_substring_in_lexicographical_order;

// #Hard #String #Two_Pointers #2022_03_05_Time_12_ms_(96.43%)_Space_58.6_MB_(8.93%)

public class Solution {
    public String lastSubstring(String str) {
        char[] s = str.toCharArray();
        int i = 0;
        int j = i + 1;
        int l = 0;
        int n = s.length;
        while (j + l < n) {
            if (s[i + l] == s[j + l]) {
                l++;
            } else {
                if (s[i + l] <= s[j + l]) {
                    if (s[j + l] > s[i]) {
                        i = j + l;
                    } else {
                        int p = j - i;
                        i = j + (l / p) * p;
                    }
                }
                j = j + l + 1;
                l = 0;
            }
        }
        return str.substring(i);
    }
}
