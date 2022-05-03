package g1801_1900.s1818_minimum_absolute_sum_difference;

// #Medium #Array #Sorting #Binary_Search #Ordered_Set #Binary_Search_II_Day_7
// #2022_05_03_Time_13_ms_(99.44%)_Space_78.1_MB_(33.15%)

public class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            min = Math.min(min, Math.min(nums1[i], nums2[i]));
            max = Math.max(max, Math.max(nums1[i], nums2[i]));
        }
        int[] less = new int[max - min + 1];
        int[] more = new int[max - min + 1];
        less[0] = -max - 1;
        more[more.length - 1] = ((max + 1) << 1);
        for (int num : nums1) {
            less[num - min] = num;
            more[num - min] = num;
        }
        for (int i = 1; i < less.length; i++) {
            if (less[i] == 0) {
                less[i] = less[i - 1];
            }
        }
        for (int i = more.length - 2; i >= 0; i--) {
            if (more[i] == 0) {
                more[i] = more[i + 1];
            }
        }
        int total = 0;
        int preSave = 0;
        for (int i = 0; i < nums1.length; i++) {
            int current = Math.abs(nums1[i] - nums2[i]);
            total += current;
            int save =
                    current
                            - Math.min(
                                    Math.abs(less[nums2[i] - min] - nums2[i]),
                                    Math.abs(more[nums2[i] - min] - nums2[i]));
            if (save > preSave) {
                total = total + preSave - save;
                preSave = save;
            }
            total = total % 1_000_000_007;
        }
        return total;
    }
}
