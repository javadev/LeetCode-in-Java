package g1701_1800.s1784_check_if_binary_string_has_at_most_one_segment_of_ones;

// #Easy #String #2022_04_30_Time_1_ms_(65.60%)_Space_42.6_MB_(11.20%)

public class Solution {
    public boolean checkOnesSegment(String s) {
        boolean metOne = false;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1' && metOne) {
                return false;
            }
            if (s.charAt(i) == '1') {
                metOne = true;
                while (i < s.length() && s.charAt(i) == '1') {
                    i++;
                }
            }
            i++;
        }
        return true;
    }
}
