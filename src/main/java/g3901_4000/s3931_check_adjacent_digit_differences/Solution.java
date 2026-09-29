package g3901_4000.s3931_check_adjacent_digit_differences;

// #Easy #String #Mid_Level #Weekly_Contest_502
// #2026_09_29_Time_1_ms_(100.00%)_Space_43.68_MB_(59.35%)

public class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) > 2) {
                return false;
            }
        }
        return true;
    }
}
