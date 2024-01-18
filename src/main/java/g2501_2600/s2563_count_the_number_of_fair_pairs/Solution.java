package g2501_2600.s2563_count_the_number_of_fair_pairs;

// #Medium #Array #Sorting #Binary_Search #Two_Pointers
// #2023_08_21_Time_23_ms_(100.00%)_Space_55.5_MB_(86.80%)

import java.util.Arrays;

public class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long c1 = 0;
        long c2 = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] <= upper) {
                c1 = c1 + (j - i);
                i++;
            } else {
                j--;
            }
        }
        i = 0;
        j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] < lower) {
                c2 = c2 + (j - i);
                i++;
            } else {
                j--;
            }
        }
        return c1 - c2;
    }
}
