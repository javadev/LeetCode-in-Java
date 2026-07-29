package g3801_3900.s3856_trim_trailing_vowels;

// #Easy #String #Mid_Level #Weekly_Contest_491
// #2026_07_27_Time_1_ms_(99.24%)_Space_44.18_MB_(85.98%)

public class Solution {
    public String trimTrailingVowels(String s) {
        int i = s.length() - 1;
        while (i >= 0
                && (s.charAt(i) == 'a'
                        || s.charAt(i) == 'e'
                        || s.charAt(i) == 'i'
                        || s.charAt(i) == 'o'
                        || s.charAt(i) == 'u')) {
            i--;
        }
        return s.substring(0, i + 1);
    }
}
