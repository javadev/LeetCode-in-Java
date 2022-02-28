package g0101_0200.s0150_evaluate_reverse_polish_notation;

// #Medium #Top_Interview_Questions #Array #Math #Stack
// #2022_02_23_Time_12_ms_(29.56%)_Space_44.8_MB_(8.19%)

import java.util.Stack;

@SuppressWarnings("java:S1149")
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!Character.isDigit(tokens[i].charAt(tokens[i].length() - 1))) {
                st.push(eval(st.pop(), st.pop(), tokens[i]));
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }

    private int eval(int second, int first, String operator) {
        switch (operator) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            default:
                return first / second;
        }
    }
}
