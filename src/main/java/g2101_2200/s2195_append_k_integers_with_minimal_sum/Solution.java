package g2101_2200.s2195_append_k_integers_with_minimal_sum;

// #Medium #Array #Math #Sorting #Greedy

import java.util.Arrays;

public class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                if (nums[i] - n > k) {
                    break;
                }
                sum += nums[i];
                n++;
            }
        }
        long t = n + k;
        return (1 + t) * t / 2 - sum;
    }
}
