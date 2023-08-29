package g2601_2700.s2605_form_smallest_number_from_two_digit_arrays;

// #Easy #Array #Hash_Table #Enumeration #2023_08_29_Time_1_ms_(95.34%)_Space_40.4_MB_(61.44%)

import java.util.Arrays;

public class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] temp = new int[Math.max(nums1[nums1.length - 1], nums2[nums2.length - 1]) + 1];
        int n1 = nums1[0];
        int n2 = nums2[0];
        int k = Math.min(n1 * 10 + n2, n2 * 10 + n1);
        for (int value : nums1) {
            temp[value]++;
        }
        for (int i : nums2) {
            if (temp[i] > 0) {
                k = Math.min(k, i);
                return k;
            }
        }
        return k;
    }
}
