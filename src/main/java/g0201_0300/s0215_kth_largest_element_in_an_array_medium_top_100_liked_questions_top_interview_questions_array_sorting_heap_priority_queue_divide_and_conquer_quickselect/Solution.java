package g0201_0300.s0215_kth_largest_element_in_an_array_medium_top_100_liked_questions_top_interview_questions_array_sorting_heap_priority_queue_divide_and_conquer_quickselect;

import java.util.Arrays;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n - k];
    }
}
