package g0501_0600.s0503_next_greater_element_ii;

// #Medium #Array #Stack #Monotonic_Stack

import java.util.Stack;

public class Solution {
    // credit: https://leetcode.com/articles/next-greater-element-ii/
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length * 2 - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % nums.length]) {
                stack.pop();
            }
            result[i % nums.length] = stack.isEmpty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }
        return result;
    }
}
