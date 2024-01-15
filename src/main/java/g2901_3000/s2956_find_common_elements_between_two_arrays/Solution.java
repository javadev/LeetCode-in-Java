package g2901_3000.s2956_find_common_elements_between_two_arrays;

// #Easy #Array #Hash_Table #2024_01_15_Time_1_ms_(100.00%)_Space_45.6_MB_(11.23%)

public class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] freq2 = new int[101];
        int[] freq1 = new int[101];
        int[] ans = new int[2];
        for (int j : nums2) {
            freq2[j] = 1;
        }
        for (int j : nums1) {
            freq1[j] = 1;
            ans[0] = ans[0] + freq2[j];
        }
        for (int j : nums2) {
            ans[1] = ans[1] + freq1[j];
        }
        return ans;
    }
}
