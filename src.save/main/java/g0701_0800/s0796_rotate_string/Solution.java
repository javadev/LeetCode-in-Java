package g0701_0800.s0796_rotate_string;

// #Easy #String #String_Matching #2022_03_26_Time_0_ms_(100.00%)_Space_40_MB_(87.27%)

public class Solution {
    private boolean check(String s, String goal, int i) {
        int j = 0;
        int len = goal.length();
        while (j < len) {
            if (i == len) {
                i = 0;
            }
            if (s.charAt(i) != goal.charAt(j)) {
                return false;
            }
            j++;
            i++;
        }
        return true;
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int len = s.length();
        if (s.charAt(0) == goal.charAt(0) && !s.equals(goal)) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == goal.charAt(0) && check(s, goal, i)) {
                return true;
            }
        }
        return false;
    }
}
