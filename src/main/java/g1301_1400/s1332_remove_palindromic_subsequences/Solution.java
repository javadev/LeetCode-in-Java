package g1301_1400.s1332_remove_palindromic_subsequences;

// #Easy #String #Two_Pointers #2022_03_19_Time_0_ms_(100.00%)_Space_39.9_MB_(78.40%)

public class Solution {
    public int removePalindromeSub(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (s.equals((new StringBuilder(s)).reverse().toString())) {
            return 1;
        }
        return 2;
    }
}
