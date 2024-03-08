package g0401_0500.s0409_longest_palindrome;

// #Easy #String #Hash_Table #Greedy #Data_Structure_II_Day_6_String #Level_1_Day_5_Greedy
// #2022_07_16_Time_2_ms_(92.90%)_Space_40.5_MB_(95.32%)

import java.util.BitSet;

public class Solution {
    public int longestPalindrome(String s) {
        BitSet set = new BitSet(60);
        for (char c : s.toCharArray()) {
            set.flip(c - 'A');
        }
        if (set.isEmpty()) {
            return s.length();
        }
        return s.length() - set.cardinality() + 1;
    }
}
