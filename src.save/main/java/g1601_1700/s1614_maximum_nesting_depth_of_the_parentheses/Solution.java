package g1601_1700.s1614_maximum_nesting_depth_of_the_parentheses;

// #Easy #String #Stack #2022_04_12_Time_1_ms_(80.44%)_Space_41.4_MB_(78.91%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int maxDepth(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int maxDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                maxDepth = Math.max(maxDepth, stack.size());
                stack.pop();
            }
        }
        return maxDepth;
    }
}
