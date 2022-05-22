package g1901_2000.s1984_minimum_difference_between_highest_and_lowest_of_k_scores;

// #Easy #Array #Sorting #Sliding_Window #2022_05_22_Time_10_ms_(7.97%)_Space_47_MB_(57.18%)

import java.util.Arrays;

public class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = nums[nums.length - 1];
        for (int i = 0; i <= nums.length - k; i++) {
            minDiff = Math.min(minDiff, nums[i + k - 1] - nums[i]);
        }
        return minDiff;
    }
}
