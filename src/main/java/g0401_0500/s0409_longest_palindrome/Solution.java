package g0401_0500.s0409_longest_palindrome;

// #Easy #String #Hash_Table #Greedy #Data_Structure_II_Day_6_String
// #2022_03_16_Time_1_ms_(100.00%)_Space_40.1_MB_(75.61%)

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
