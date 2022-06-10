package g1801_1900.s1877_minimize_maximum_pair_sum_in_array;

// #Medium #Array #Sorting #Greedy #Two_Pointers
// #2022_05_10_Time_62_ms_(82.87%)_Space_50.5_MB_(99.71%)

import java.util.Arrays;

public class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int min = Integer.MIN_VALUE;
        while (start < end) {
            min = Math.max(min, nums[start] + nums[end]);
            --end;
            ++start;
        }
        return min;
    }
}
