package g2101_2200.s2195_append_k_integers_with_minimal_sum;

// #Medium #Array #Math #Sorting #Greedy #2022_06_06_Time_19_ms_(96.88%)_Space_60_MB_(78.44%)

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
        long t = n + (long) k;
        return (1 + t) * t / 2 - sum;
    }
}
