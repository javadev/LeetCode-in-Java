package g0901_1000.s0946_validate_stack_sequences;

// #Medium #Array #Stack #Simulation #2022_02_20_Time_6_ms_(20.54%)_Space_44.7_MB_(28.97%)

import java.util.Stack;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int j = 0;
        int len = pushed.length;
        while (i < len) {
            if (pushed[i] == popped[j]) {
                i++;
                j++;
            } else if (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            } else {
                stack.push(pushed[i++]);
            }
        }
        while (j < len) {
            if (!stack.isEmpty() && stack.peek() != popped[j++]) {
                return false;
            } else {
                stack.pop();
            }
        }
        return true;
    }
}
