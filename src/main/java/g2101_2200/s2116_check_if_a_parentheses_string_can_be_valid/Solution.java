package g2101_2200.s2116_check_if_a_parentheses_string_can_be_valid;

// #Medium #String #Greedy #Stack #2022_06_01_Time_19_ms_(85.53%)_Space_65.3_MB_(41.88%)

public class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        if ((s.length() & 1) > 0) {
            return false;
        }
        if (locked == null || locked.isEmpty()) {
            return true;
        }
        int numOfLockedClose = 0;
        int numOfLockedOpen = 0;
        for (int i = 0; i < s.length(); i++) {
            int countOfChars = i + 1;
            if (s.charAt(i) == ')' && locked.charAt(i) == '1') {
                numOfLockedClose++;
                if (numOfLockedClose * 2 > countOfChars) {
                    return false;
                }
            }
            int j = s.length() - 1 - i;
            if (s.charAt(j) == '(' && locked.charAt(j) == '1') {
                numOfLockedOpen++;

                if (numOfLockedOpen * 2 > countOfChars) {
                    return false;
                }
            }
        }
        return true;
    }
}
