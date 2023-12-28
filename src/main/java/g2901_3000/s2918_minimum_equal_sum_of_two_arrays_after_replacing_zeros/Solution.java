package g2901_3000.s2918_minimum_equal_sum_of_two_arrays_after_replacing_zeros;

// #Medium #Array #Greedy #2023_12_28_Time_3_ms_(98.52%)_Space_60.7_MB_(8.70%)

public class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long s1 = 0;
        long s2 = 0;
        long l = 0;
        long r = 0;
        for (int i : nums1) {
            s1 += i;
            if (i == 0) {
                l++;
            }
        }
        for (int i : nums2) {
            s2 += i;
            if (i == 0) {
                r++;
            }
        }
        if (s1 == s2 && l == 0 && r == 0) {
            return s1;
        }
        long x = Math.abs(s1 - s2);
        if (s1 > s2) {
            if (r == 0 || (l == 0 && r > x)) {
                return -1;
            }
            if (l == 0) {
                return s1;
            }
            return s1 + Math.max(l, r - x);
        } else {
            if (l == 0 || (r == 0 && l > x)) {
                return -1;
            }
            if (s1 == s2) {
                return s1 + Math.max(l, r);
            }
            if (r == 0) {
                return s2;
            }
            return s2 + Math.max(r, l - x);
        }
    }
}
