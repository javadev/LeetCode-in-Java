package g2801_2900.s2874_maximum_value_of_an_ordered_triplet_ii;

// #Medium #Array #2023_12_22_Time_2_ms_(99.67%)_Space_57.5_MB_(41.20%)

public class Solution {
    public long maximumTripletValue(int[] nums) {
        int[] diff = new int[nums.length];
        int tempMax = nums[0];
        for (int i = 1; i < diff.length - 1; i++) {
            diff[i] = tempMax - nums[i];
            tempMax = Math.max(tempMax, nums[i]);
        }
        long max = Long.MIN_VALUE;
        tempMax = nums[nums.length - 1];
        for (int i = nums.length - 2; i > 0; i--) {
            max = Math.max(max, (long) tempMax * diff[i]);
            tempMax = Math.max(tempMax, nums[i]);
        }
        return Math.max(max, 0);
    }
}
