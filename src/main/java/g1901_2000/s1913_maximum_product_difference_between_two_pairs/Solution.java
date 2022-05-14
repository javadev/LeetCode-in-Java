package g1901_2000.s1913_maximum_product_difference_between_two_pairs;

// #Easy #Array #Sorting #2022_05_14_Time_8_ms_(57.76%)_Space_54.8_MB_(5.81%)

import java.util.Arrays;

public class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len - 1] * nums[len - 2] - nums[0] * nums[1];
    }
}
