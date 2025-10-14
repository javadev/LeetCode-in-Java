package g3701_3800.s3707_equal_score_substrings;

// #Easy #String #Prefix_Sum #Biweekly_Contest_167
// #2025_10_14_Time_1_ms_(100.00%)_Space_42.65_MB_(41.05%)

public class Solution {
    public boolean scoreBalance(String s) {
        int total = 0;
        for (char c : s.toCharArray()) {
            total += c - 'a' + 1;
        }
        int prefix = 0;
        for (char c : s.toCharArray()) {
            prefix += c - 'a' + 1;
            if (2 * prefix == total) {
                return true;
            }
        }
        return false;
    }
}
