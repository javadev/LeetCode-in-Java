package g3101_3200.s3194_minimum_average_of_smallest_and_largest_elements;

// #Easy #Array #Sorting #Two_Pointers #2024_06_26_Time_2_ms_(98.88%)_Space_43.5_MB_(88.12%)

import java.util.Arrays;

public class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double m = 102.0;
        for (int i = 0, l = nums.length; i < l / 2; i++) {
            m = Math.min(m, nums[i] + (double) nums[l - i - 1]);
        }
        return m / 2.0;
    }
}
