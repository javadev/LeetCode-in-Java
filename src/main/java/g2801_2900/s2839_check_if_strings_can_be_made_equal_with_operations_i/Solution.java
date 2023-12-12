package g2801_2900.s2839_check_if_strings_can_be_made_equal_with_operations_i;

// #Easy #String #2023_12_12_Time_1_ms_(99.09%)_Space_41.8_MB_(41.03%)

public class Solution {
    public boolean canBeEqual(String s1, String s2) {
        return isOk(s1, s2, 0) && isOk(s1, s2, 1);
    }

    private boolean isOk(String s1, String s2, int i) {
        char a = s1.charAt(i);
        char b = s1.charAt(i + 2);
        char c = s2.charAt(i);
        char d = s2.charAt(i + 2);
        if (a == c && b == d) {
            return true;
        }
        return a == d && b == c;
    }
}
