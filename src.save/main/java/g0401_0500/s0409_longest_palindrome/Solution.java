package g0401_0500.s0409_longest_palindrome;

// #Easy #String #Hash_Table #Greedy

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
