package g0201_0300.s0215_kth_largest_element_in_an_array;

import java.util.Arrays;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n - k];
    }
}
