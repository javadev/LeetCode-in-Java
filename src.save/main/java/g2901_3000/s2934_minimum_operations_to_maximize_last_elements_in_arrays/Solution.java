package g2901_3000.s2934_minimum_operations_to_maximize_last_elements_in_arrays;

// #Medium #Array #Greedy #2024_01_02_Time_1_ms_(100.00%)_Space_45.2_MB_(5.34%)

public class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int max1;
        int max2;
        int count1 = 0;
        int count2 = 0;
        max1 = Math.min(nums1[n - 1], nums2[n - 1]);
        max2 = Math.max(nums1[n - 1], nums2[n - 1]);
        for (int i = 0; i < n; i++) {
            int min = Math.min(nums1[i], nums2[i]);
            int max = Math.max(nums1[i], nums2[i]);
            if (max > max2 || min > max1) {
                return -1;
            }
            if (max == nums1[i] && max != min && max > max1) {
                count1++;
            }
            if (max == nums2[i] && max != min && max > max1) {
                count2++;
            }
        }
        return Math.min(count1, count2);
    }
}
