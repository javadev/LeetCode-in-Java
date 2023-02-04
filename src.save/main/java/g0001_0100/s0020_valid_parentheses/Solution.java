package g0001_0100.s0020_valid_parentheses;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #String #Stack
// #Data_Structure_I_Day_9_Stack_Queue #Udemy_Strings
// #2022_06_14_Time_3_ms_(51.72%)_Space_41.5_MB_(73.27%)

import java.util.Stack;

@SuppressWarnings("java:S1149")
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
