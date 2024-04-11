package g3101_3200.s3107_minimum_operations_to_make_median_of_array_equal_to_k;

// #Medium #Array #Sorting #Greedy #2024_04_11_Time_28_ms_(98.49%)_Space_61.8_MB_(98.64%)

import java.util.Arrays;

public class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int medianIndex = n / 2;
        long result = 0;
        int totalElements = 0;
        long totalSum = 0;
        int i = medianIndex;
        if (nums[medianIndex] > k) {
            while (i >= 0 && nums[i] > k) {
                totalElements += 1;
                totalSum += nums[i];
                i -= 1;
            }
        } else if (nums[medianIndex] < k) {
            while (i < n && nums[i] < k) {
                totalElements += 1;
                totalSum += nums[i];
                i += 1;
            }
        }
        result += Math.abs(totalSum - ((long) totalElements * k));
        return result;
    }
}
