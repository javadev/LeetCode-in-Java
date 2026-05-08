package g3701_3800.s3774_absolute_difference_between_maximum_and_minimum_k_elements;

// #Easy #Array #Sorting #Mid_Level #Weekly_Contest_480
// #2026_05_08_Time_5_ms_(96.82%)_Space_46.97_MB_(28.79%)

import java.util.Arrays;

public class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int maxSum = 0;
        int minSum = 0;
        for (int i = 0, j = nums.length - 1; i < k; i++, j--) {
            minSum += nums[i];
            maxSum += nums[j];
        }
        return maxSum - minSum;
    }
}
