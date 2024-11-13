package g3301_3400.s3347_maximum_frequency_of_an_element_after_performing_operations_ii;

// #Hard #Array #Sorting #Binary_Search #Prefix_Sum #Sliding_Window
// #2024_11_13_Time_30_ms_(98.88%)_Space_56.7_MB_(93.07%)

import java.util.Arrays;

public class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0;
        int r = 0;
        int i = 0;
        int j = 0;
        int res = 0;
        while (i < n) {
            while (j < n && nums[j] == nums[i]) {
                j++;
            }
            while (l < i && nums[i] - nums[l] > k) {
                l++;
            }
            while (r < n && nums[r] - nums[i] <= k) {
                r++;
            }
            res = Math.max(res, Math.min(i - l + r - j, numOperations) + j - i);
            i = j;
        }
        i = 0;
        j = 0;
        while (i < n && j < n) {
            while (j < n && j - i < numOperations && nums[j] - nums[i] <= k * 2) {
                j++;
            }
            res = Math.max(res, j - i);
            i++;
        }
        return res;
    }
}
