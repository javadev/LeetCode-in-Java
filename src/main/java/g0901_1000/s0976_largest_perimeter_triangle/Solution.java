package g0901_1000.s0976_largest_perimeter_triangle;

// #Easy #Array #Math #Sorting #Greedy #Programming_Skills_I_Day_3_Conditional_Statements
// #2024_12_19_Time_7_ms_(99.33%)_Space_45.5_MB_(8.45%)

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
