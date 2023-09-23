package g2701_2800.s2740_find_the_value_of_the_partition;

// #Medium #Array #Sorting #2023_09_23_Time_18_ms_(100.00%)_Space_54.6_MB_(33.05%)

import java.util.Arrays;

public class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int difference = nums[i] - nums[i - 1];
            if (difference < minDifference) {
                minDifference = difference;
            }
        }
        return minDifference;
    }
}
