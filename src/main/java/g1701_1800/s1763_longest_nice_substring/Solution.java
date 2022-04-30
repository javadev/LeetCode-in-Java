package g1701_1800.s1763_longest_nice_substring;

// #Easy #String #Hash_Table #Bit_Manipulation #Sliding_Window
// #2022_04_30_Time_5_ms_(61.88%)_Space_43.7_MB_(27.43%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String longestNiceSubstring(String s) {
        int index = isNotNiceString(s);
        if (index == -1) {
            return s;
        }
        String left = longestNiceSubstring(s.substring(0, index));
        String right = longestNiceSubstring(s.substring(index + 1));
        return left.length() >= right.length() ? left : right;
    }

    private int isNotNiceString(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(Character.toLowerCase(c))
                    || !set.contains(Character.toUpperCase(c))) {
                return i;
            }
        }
        return -1;
    }
}
