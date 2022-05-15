package g0201_0300.s0215_kth_largest_element_in_an_array;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Sorting #Heap_Priority_Queue
// #Divide_and_Conquer #Quickselect #Acceptance_63.6% #Data_Structure_II_Day_20_Heap_Priority_Queue
// #2022_03_05_Time_2_ms_(93.01%)_Space_41.7_MB_(79.50%)

import java.util.Arrays;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n - k];
    }
}
