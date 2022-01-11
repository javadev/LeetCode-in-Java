package g0501_0600.s0581_shortest_unsorted_continuous_subarray;

// #Medium #Array #Sorting #Greedy #Two_Pointers #Stack #Monotonic_Stack

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int end = -2;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < max) {
                end = i;
            }
        }
        int start = -1;
        int min = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            if (nums[i] > min) {
                start = i;
            }
        }
        return end - start + 1;
    }
}
