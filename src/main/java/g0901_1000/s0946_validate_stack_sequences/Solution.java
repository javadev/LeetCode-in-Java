package g0901_1000.s0946_validate_stack_sequences;

// #Medium #Array #Stack #Simulation #2022_12_26_Time_1_ms_(98.95%)_Space_42_MB_(87.24%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
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
