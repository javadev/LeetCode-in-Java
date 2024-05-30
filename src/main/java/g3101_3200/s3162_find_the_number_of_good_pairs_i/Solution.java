package g3101_3200.s3162_find_the_number_of_good_pairs_i;

// #Easy #Array #Hash_Table #2024_05_30_Time_1_ms_(99.96%)_Space_42.1_MB_(99.36%)

public class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int c = 0;
        for (int j : nums1) {
            for (int value : nums2) {
                if (j % (value * k) == 0) {
                    c++;
                }
            }
        }
        return c;
    }
}
