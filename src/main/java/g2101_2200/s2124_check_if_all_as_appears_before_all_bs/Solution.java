package g2101_2200.s2124_check_if_all_as_appears_before_all_bs;

// #Easy #String #2022_06_02_Time_1_ms_(73.82%)_Space_41.7_MB_(67.70%)

public class Solution {
    public boolean checkString(String s) {
        int aEndIndex = -1;
        int bStartIndex = -1;
        if (s.length() == 1) {
            return true;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'a') {
                aEndIndex = i;
                break;
            }
        }
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'b') {
                bStartIndex = i;
                break;
            }
        }
        if (aEndIndex == -1 || bStartIndex == -1) {
            return true;
        }
        return bStartIndex > aEndIndex;
    }
}
