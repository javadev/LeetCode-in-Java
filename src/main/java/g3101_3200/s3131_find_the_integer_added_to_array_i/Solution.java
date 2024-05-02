package g3101_3200.s3131_find_the_integer_added_to_array_i;

// #Easy #Array #2024_05_02_Time_0_ms_(100.00%)_Space_43_MB_(75.29%)

public class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int s1 = 0;
        int s2 = 0;
        for (int i : nums1) {
            s1 += i;
        }
        for (int i : nums2) {
            s2 += i;
        }
        return (s2 - s1) / n1;
    }
}
