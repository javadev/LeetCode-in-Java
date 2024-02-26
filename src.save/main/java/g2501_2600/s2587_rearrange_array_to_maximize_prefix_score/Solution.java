package g2501_2600.s2587_rearrange_array_to_maximize_prefix_score;

// #Medium #Array #Sorting #Greedy #Prefix_Sum
// #2023_08_22_Time_28_ms_(92.55%)_Space_57.7_MB_(77.66%)

import java.util.Arrays;

public class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        long sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }
}
