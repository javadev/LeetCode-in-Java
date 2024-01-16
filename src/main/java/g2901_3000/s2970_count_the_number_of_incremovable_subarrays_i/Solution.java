package g2901_3000.s2970_count_the_number_of_incremovable_subarrays_i;

// #Easy #Array #Binary_Search #Two_Pointers #Enumeration
// #2024_01_16_Time_0_ms_(100.00%)_Space_42.9_MB_(87.73%)

public class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int res = 0;
        int left = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int right = Integer.MAX_VALUE;
            for (int j = n - 1; i <= j; j--) {
                res++;
                if (left >= nums[j] || nums[j] >= right) {
                    break;
                }
                right = nums[j];
            }
            if (left >= nums[i]) {
                break;
            }
            left = nums[i];
        }
        return res;
    }
}
