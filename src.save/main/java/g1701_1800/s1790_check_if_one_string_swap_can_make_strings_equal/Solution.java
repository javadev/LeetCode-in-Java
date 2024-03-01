package g1701_1800.s1790_check_if_one_string_swap_can_make_strings_equal;

// #Easy #String #Hash_Table #Counting #Programming_Skills_I_Day_4_Loop
// #2022_05_03_Time_0_ms_(100.00%)_Space_40.3_MB_(89.65%)

public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int i1 = -1;
        int i2 = -1;
        // We go though the two strings
        for (int i = 0; i < s1.length(); i++) {
            // check if each char is the same.
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            }
            // When there are more than 2 char different., we return false;
            if (i2 != -1) {
                return false;
            }
            // If there is char that is different, we record the index.
            if (i1 == -1) {
                i1 = i;
            } else {
                // If there is char that is different, we record the index.
                i2 = i;
            }
        }
        // When three is no different char, we return true;
        if (i1 == i2) {
            return true;
        }
        // When there is 1 char different, we return false;
        if (i2 == -1) {
            return false;
        }
        // When there are 2 char different, and swap them can make two string equal, we return true;
        return s1.charAt(i1) == s2.charAt(i2) && s1.charAt(i2) == s2.charAt(i1);
    }
}
