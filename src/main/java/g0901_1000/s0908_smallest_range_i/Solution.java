package g0901_1000.s0908_smallest_range_i;

// #Easy #Array #Math

public class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        if (min + k >= max - k) {
            return 0;
        }
        return (max - k) - (min + k);
    }
}
