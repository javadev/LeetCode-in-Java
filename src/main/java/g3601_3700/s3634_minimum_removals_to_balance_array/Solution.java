package g3601_3700.s3634_minimum_removals_to_balance_array;

// #Medium #Biweekly_Contest_162 #2025_08_03_Time_21_ms_(100.00%)_Space_60.28_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int minRemoval(int[] nums, int k) {
        // Sort array to maintain order
        Arrays.sort(nums);
        int n = nums.length;
        int maxSize = 0;
        int left = 0;
        // Use sliding window to find longest valid subarray
        for (int right = 0; right < n; right++) {
            // While condition is violated, shrink window from left
            while (nums[right] > (long) k * nums[left]) {
                left++;
            }
            maxSize = Math.max(maxSize, right - left + 1);
        }
        // Return number of elements to remove
        return n - maxSize;
    }
}
