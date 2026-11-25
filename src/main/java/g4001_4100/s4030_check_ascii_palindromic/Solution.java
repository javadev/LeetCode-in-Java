package g4001_4100.s4030_check_ascii_palindromic;

// #Easy #String #Two_Pointers #Bit_Manipulation #Mid_Level #Weekly_Contest_516
// #2026_11_25_Time_1_ms_(99.80%)_Space_42.93_MB_(99.02%)

public class Solution {
    public boolean isPalindromic(String s) {
        int n = s.length();
        for (int i = 0; i <= n / 2; i++) {
            int lptr = s.charAt(i);
            int rptr = s.charAt(n - i - 1);
            for (int j = 0; j < 8; j++) {
                int left = (lptr >> j) & 1;
                int right = (rptr >> (7 - j)) & 1;
                if (left != right) {
                    return false;
                }
            }
        }
        return true;
    }
}
