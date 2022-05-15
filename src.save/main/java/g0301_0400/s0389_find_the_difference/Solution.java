package g0301_0400.s0389_find_the_difference;

// #Easy #String #Hash_Table #Sorting #Bit_Manipulation #Acceptance_60.5%
// #Programming_Skills_I_Day_8_String #2022_03_16_Time_1_ms_(99.83%)_Space_40.3_MB_(90.11%)

public class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for (char cs : s.toCharArray()) {
            c ^= cs;
        }
        for (char ct : t.toCharArray()) {
            c ^= ct;
        }
        return c;
    }
}
