package g2701_2800.s2771_longest_non_decreasing_subarray_from_two_arrays;

// #Medium #Array #Dynamic_Programming #2023_09_21_Time_4_ms_(97.62%)_Space_56.9_MB_(78.75%)

public class Solution {
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int res = 1;
        int dp1 = 1;
        int dp2 = 1;
        int n = nums1.length;
        int t11;
        int t12;
        int t21;
        int t22;
        for (int i = 1; i < n; i++) {
            t11 = (nums1[i - 1] <= nums1[i]) ? dp1 + 1 : 1;
            t12 = (nums1[i - 1] <= nums2[i]) ? dp1 + 1 : 1;
            t21 = (nums2[i - 1] <= nums1[i]) ? dp2 + 1 : 1;
            t22 = (nums2[i - 1] <= nums2[i]) ? dp2 + 1 : 1;
            dp1 = Math.max(t11, t21);
            dp2 = Math.max(t12, t22);
            res = Math.max(res, Math.max(dp1, dp2));
        }
        return res;
    }
}
