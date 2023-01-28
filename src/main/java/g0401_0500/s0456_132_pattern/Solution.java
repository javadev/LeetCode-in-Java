package g0401_0500.s0456_132_pattern;

// #Medium #Array #Binary_Search #Stack #Ordered_Set #Monotonic_Stack #Udemy_Arrays
// #2022_07_18_Time_16_ms_(82.41%)_Space_71.9_MB_(8.42%)

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    /*
     * It scans only once, this is the power of using correct data structure.
     * It goes from the right to the left.
     * It keeps pushing elements into the stack,
     * but it also keeps poping elements out of the stack as long as the current element is bigger than this number.
     */
    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new LinkedList<>();
        int s3 = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < s3) {
                return true;
            } else {
                while (!stack.isEmpty() && nums[i] > stack.peek()) {
                    s3 = Math.max(s3, stack.pop());
                }
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
