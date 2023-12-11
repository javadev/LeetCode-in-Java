package g2701_2800.s2730_find_the_longest_semi_repetitive_substring;

// #Medium #String #Sliding_Window #2023_09_22_Time_5_ms_(100.00%)_Space_44.5_MB_(13.68%)

public class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int i = 0;
        int cur = 0;
        int n = s.length();
        for (int j = 1; j < n; j++) {
            cur += (s.charAt(j) == s.charAt(j - 1)) ? 1 : 0;
            if (cur > 1) {
                cur -= (s.charAt(++i) == s.charAt(i - 1)) ? 1 : 0;
            }
        }
        return n - i;
    }
}
