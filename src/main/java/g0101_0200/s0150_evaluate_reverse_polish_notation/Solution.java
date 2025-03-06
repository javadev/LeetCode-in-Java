package g0101_0200.s0150_evaluate_reverse_polish_notation;

// #Medium #Top_Interview_Questions #Array #Math #Stack #Programming_Skills_II_Day_3
// #Top_Interview_150_Stack #2025_03_06_Time_6_ms_(76.50%)_Space_44.94_MB_(31.04%)

import java.util.Stack;

@SuppressWarnings("java:S1149")
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (!Character.isDigit(token.charAt(token.length() - 1))) {
                st.push(eval(st.pop(), st.pop(), token));
            } else {
                st.push(Integer.parseInt(token));
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
