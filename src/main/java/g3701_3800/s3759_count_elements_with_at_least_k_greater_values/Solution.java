package g3701_3800.s3759_count_elements_with_at_least_k_greater_values;

// #Medium #Array #Sorting #Binary_Search #Divide_and_Conquer #Quickselect #Senior
// #Weekly_Contest_478 #2026_04_25_Time_40_ms_(96.15%)_Space_134.18_MB_(73.08%)

import java.util.Arrays;

public class Solution {
    public int countElements(int[] nums, int k) {
        if (k == 0) {
            return nums.length;
        }
        Arrays.sort(nums);
        int i = nums.length - k;
        int n = nums[i];
        if (nums[0] == n) {
            return 0;
        }
        while (n == nums[i]) {
            i--;
        }
        return i + 1;
    }
}
