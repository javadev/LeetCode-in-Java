package g1401_1500.s1432_max_difference_you_can_get_from_changing_an_integer;

// #Medium #Math #Greedy #2022_03_28_Time_1_ms_(97.22%)_Space_39.4_MB_(80.56%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int maxDiff(int num) {
        Deque<Integer> stack = new ArrayDeque<>();
        int xMax = 9;
        int yMax = 9;
        int xMin = 0;
        int yMin = 0;
        int min = 0;
        int max = 0;
        boolean areDigitsUnique = true;
        while (num != 0) {
            if (!stack.isEmpty() && num % 10 != stack.peek()) {
                areDigitsUnique = false;
            }
            stack.push(num % 10);
            num /= 10;
            if (stack.peek() != 9) {
                xMax = stack.peek();
            }
            if (stack.peek() > 1) {
                xMin = stack.peek();
            }
        }
        if (areDigitsUnique || stack.peek() == xMin) {
            // Handles no leading zeros/non zero constraints.
            yMin = 1;
        }
        while (!stack.isEmpty()) {
            min = min * 10 + (stack.peek() == xMin ? yMin : stack.peek());
            max = max * 10 + (stack.peek() == xMax ? yMax : stack.peek());
            stack.pop();
        }
        return max - min;
    }
}
