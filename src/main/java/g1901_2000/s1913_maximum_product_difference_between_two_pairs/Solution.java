package g1901_2000.s1913_maximum_product_difference_between_two_pairs;

// #Easy #Array #Sorting #2022_05_24_Time_7_ms_(70.01%)_Space_42.6_MB_(82.74%)

import java.util.Arrays;

public class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len - 1] * nums[len - 2] - nums[0] * nums[1];
    }
}
