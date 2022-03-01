package g0901_1000.s0976_largest_perimeter_triangle;

// #Easy #Array #Math #Sorting #Greedy

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        // for non zero area of triangle (c < a+b)
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
}
