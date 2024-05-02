package g3101_3200.s3132_find_the_integer_added_to_array_ii;

// #Medium #Array #Sorting #Two_Pointers #Enumeration
// #2024_05_02_Time_2_ms_(100.00%)_Space_42.3_MB_(96.46%)

import java.util.Arrays;

public class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if (checkOk(nums1, nums2, 2)) {
            return nums2[0] - nums1[2];
        } else if (checkOk(nums1, nums2, 1)) {
            return nums2[0] - nums1[1];
        } else {
            return nums2[0] - nums1[0];
        }
    }

    private boolean checkOk(int[] nums1, int[] nums2, int start) {
        int i = 0;
        int diff = nums2[i] - nums1[start];
        while (i < nums2.length) {
            if (start - i > 2) {
                return false;
            }
            if (nums2[i] == nums1[start] + diff) {
                i++;
            }
            start++;
        }
        return i == nums2.length;
    }
}
