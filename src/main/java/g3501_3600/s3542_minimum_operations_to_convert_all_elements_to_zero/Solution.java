package g3501_3600.s3542_minimum_operations_to_convert_all_elements_to_zero;

// #Medium #2025_05_11_Time_162_ms_(100.00%)_Space_61.48_MB_(100.00%)

import java.util.Stack;

public class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int res = 0;
        for (int a : nums) {
            while (!stack.isEmpty() && stack.peek() > a) {
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek() < a) {
                res++;
                stack.push(a);
            }
        }
        return res;
    }
}
