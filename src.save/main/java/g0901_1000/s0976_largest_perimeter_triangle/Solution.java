package g0901_1000.s0976_largest_perimeter_triangle;

// #Easy #Array #Math #Sorting #Greedy #Programming_Skills_I_Day_3_Conditional_Statements
// #2022_03_31_Time_12_ms_(26.01%)_Space_53.8_MB_(69.91%)

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
