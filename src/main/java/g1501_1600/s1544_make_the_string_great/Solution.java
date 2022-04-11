package g1501_1600.s1544_make_the_string_great;

// #Easy #String #Stack #2022_04_11_Time_6_ms_(50.00%)_Space_43.2_MB_(39.51%)

import java.util.Stack;

@SuppressWarnings("java:S1149")
public class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(c);
            } else {
                if (Character.toLowerCase(stack.peek()) == Character.toLowerCase(c)) {
                    if ((Character.isLowerCase(stack.peek()) && Character.isUpperCase(c))) {
                        stack.pop();
                    } else if (Character.isUpperCase(stack.peek()) && Character.isLowerCase(c)) {
                        stack.pop();
                    } else {
                        stack.add(c);
                    }
                } else {
                    stack.add(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
