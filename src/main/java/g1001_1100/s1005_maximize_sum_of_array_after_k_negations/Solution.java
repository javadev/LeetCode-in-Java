package g1001_1100.s1005_maximize_sum_of_array_after_k_negations;

// #Easy #Array #Sorting #Greedy #2022_02_21_Time_3_ms_(81.75%)_Space_41.4_MB_(41.36%)

import java.util.Arrays;

public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int minIndex = 0;
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] *= -1;
                k--;
            }
            if (nums[minIndex] > nums[i]) {
                minIndex = i;
            }
        }
        if ((k & 1) == 1) {
            nums[minIndex] *= -1;
        }
        return Arrays.stream(nums).sum();
    }
}
