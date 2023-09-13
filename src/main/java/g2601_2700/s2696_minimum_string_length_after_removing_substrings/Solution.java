package g2601_2700.s2696_minimum_string_length_after_removing_substrings;

// #Easy #String #Stack #Simulation #2023_09_13_Time_44_ms_(97.86%)_Space_44.7_MB_(50.13%)

import java.util.ArrayDeque;

public class Solution {
    public int minLength(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()
                    && ((c == 'B' && stack.getLast() == 'A')
                            || (c == 'D' && stack.getLast() == 'C'))) {
                stack.removeLast();
            } else {
                stack.addLast(c);
            }
        }
        return stack.size();
    }
}
