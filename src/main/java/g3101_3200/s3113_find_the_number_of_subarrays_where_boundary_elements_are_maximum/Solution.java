package g3101_3200.s3113_find_the_number_of_subarrays_where_boundary_elements_are_maximum;

// #Hard #Array #Binary_Search #Stack #Monotonic_Stack
// #2024_04_27_Time_13_ms_(98.83%)_Space_60.4_MB_(67.66%)

import java.util.ArrayDeque;

public class Solution {
    public long numberOfSubarrays(int[] nums) {
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        long res = 0;
        for (int a : nums) {
            while (!stack.isEmpty() && stack.peek()[0] < a) {
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek()[0] != a) {
                stack.push(new int[] {a, 0});
            }
            res += ++stack.peek()[1];
        }
        return res;
    }
}
