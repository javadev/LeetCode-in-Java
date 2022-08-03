package g1501_1600.s1509_minimum_difference_between_largest_and_smallest_value_in_three_moves;

// #Medium #Array #Sorting #Greedy #2022_04_09_Time_19_ms_(76.94%)_Space_66.6_MB_(15.13%)

import java.util.Arrays;

public class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        if (n < 4) {
            return 0;
        }
        res = Math.min(res, nums[n - 4] - nums[0]);
        res = Math.min(res, nums[n - 3] - nums[1]);
        res = Math.min(res, nums[n - 2] - nums[2]);
        res = Math.min(res, nums[n - 1] - nums[3]);
        return res;
    }
}
