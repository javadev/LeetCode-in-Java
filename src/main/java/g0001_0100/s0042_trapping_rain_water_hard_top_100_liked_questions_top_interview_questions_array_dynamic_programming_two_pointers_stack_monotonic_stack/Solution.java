package g0001_0100.s0042_trapping_rain_water_hard_top_100_liked_questions_top_interview_questions_array_dynamic_programming_two_pointers_stack_monotonic_stack;

public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }
        int l = 0;
        int r = height.length - 1;
        int maxL = height[l];
        int maxR = height[r];
        int res = 0;
        while (l < r) {
            if (maxL < maxR) {
                maxL = Math.max(height[++l], maxL);
                res += maxL - height[l];
            } else {
                maxR = Math.max(height[--r], maxR);
                res += maxR - height[r];
            }
        }
        return res;
    }
}
