package g2501_2600.s2540_minimum_common_value;

// #Easy #Array #Hash_Table #Binary_Search #Two_Pointers
// #2023_04_22_Time_0_ms_(100.00%)_Space_58.9_MB_(33.19%)

public class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        if (nums1[0] > nums2[nums2.length - 1] || nums1[nums1.length - 1] < nums2[0]) {
            return -1;
        }
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
            if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return -1;
    }
}
