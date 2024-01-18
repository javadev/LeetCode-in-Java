package g2501_2600.s2570_merge_two_2d_arrays_by_summing_values;

// #Easy #Array #Hash_Table #Two_Pointers #2023_08_21_Time_0_ms_(100.00%)_Space_44.2_MB_(83.67%)

import java.util.Arrays;

public class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[][] res = new int[n1 + n2][2];
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < n1 && j < n2) {
            if (nums1[i][0] == nums2[j][0]) {
                res[idx][0] = nums1[i][0];
                res[idx][1] = nums1[i][1] + nums2[j][1];
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                res[idx][0] = nums1[i][0];
                res[idx][1] = nums1[i][1];
                i++;
            } else {
                res[idx][0] = nums2[j][0];
                res[idx][1] = nums2[j][1];
                j++;
            }
            idx++;
        }
        while (i < n1) {
            res[idx][0] = nums1[i][0];
            res[idx][1] = nums1[i][1];
            i++;
            idx++;
        }
        while (j < n2) {
            res[idx][0] = nums2[j][0];
            res[idx][1] = nums2[j][1];
            j++;
            idx++;
        }

        return Arrays.copyOf(res, idx);
    }
}
