package g3601_3700.s3676_count_bowl_subarrays;

// #Medium #Weekly_Contest_466 #2025_09_07_Time_19_ms_(100.00%)_Space_59.30_MB_(100.00%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public long bowlSubarrays(int[] nums) {
        int l = nums.length;
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < l; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                int mid = stack.pop();
                if (!stack.isEmpty()) {
                    int left = stack.peek();
                    if (Math.min(nums[left], nums[i]) > nums[mid]) {
                        ++ans;
                    }
                }
            }
            stack.push(i);
        }
        return ans;
    }
}
