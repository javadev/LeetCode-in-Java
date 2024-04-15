package g2501_2600.s2541_minimum_operations_to_make_array_equal_ii;

// #Medium #Array #Math #Greedy #2023_04_22_Time_3_ms_(100.00%)_Space_60.7_MB_(30.77%)

import java.util.Arrays;

public class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        long pcnt = 0;
        long ncnt = 0;
        if (k == 0) {
            if (Arrays.equals(nums1, nums2)) {
                return 0;
            } else {
                return -1;
            }
        }
        for (int i = 0; i < n; i++) {
            int tp = nums1[i] - nums2[i];
            if (tp % k != 0) {
                return -1;
            }
            if (tp > 0) {
                pcnt += tp;
            } else if (tp < 0) {
                ncnt += tp;
            }
        }
        if (pcnt + ncnt != 0) {
            return -1;
        }
        return pcnt / k;
    }
}
