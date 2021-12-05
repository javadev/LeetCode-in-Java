package g0001_0100.s0011_container_with_most_water_medium_top_100_liked_questions_top_interview_questions_array_greedy_two_pointers;

public class Solution {
    public int maxArea(int[] height) {
        int maxArea = -1;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] < height[right]) {
                maxArea = Math.max(maxArea, height[left] * (right - left));
                left++;
            } else {
                maxArea = Math.max(maxArea, height[right] * (right - left));
                right--;
            }
        }

        return maxArea;
    }
}
