package g0501_0600.s0520_detect_capital;

// #Easy #String

public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        int upper = 0;
        int lower = 0;
        int n = word.length();
        boolean firstUpper = Character.isUpperCase(word.charAt(0));
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upper++;
            } else if (Character.isLowerCase(word.charAt(i))) {
                lower++;
            }
        }
        if (firstUpper && upper > 1) {
            firstUpper = false;
        }
        return upper == n || lower == n || firstUpper;
    }
}
