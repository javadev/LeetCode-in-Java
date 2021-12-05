package g0101_0200.s0150_evaluate_reverse_polish_notation_medium_top_interview_questions_array_math_stack;

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
