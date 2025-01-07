package g3401_3500.s3407_substring_matching_pattern;

// #Easy #String #String_Matching #2025_01_06_Time_1_(100.00%)_Space_42.63_(100.00%)

public class Solution {
    public boolean hasMatch(String s, String p) {
        int index = -1;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*') {
                index = i;
                break;
            }
        }
        int num1 = fun(s, p.substring(0, index));
        if (num1 == -1) {
            return false;
        }
        int num2 = fun(s.substring(num1), p.substring(index + 1));
        return num2 != -1;
    }

    private int fun(String s, String k) {
        int n = s.length();
        int m = k.length();
        int j = 0;
        for (int i = 0; i <= n - m; i++) {
            for (j = 0; j < m; j++) {
                char ch1 = s.charAt(j + i);
                char ch2 = k.charAt(j);
                if (ch1 != ch2) break;
            }
            if (j == m) {
                return i + j;
            }
        }
        return -1;
    }
}
