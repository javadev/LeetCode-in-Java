package g3601_3700.s3627_maximum_median_sum_of_subsequences_of_size_3;

// #Medium #Array #Math #Sorting #Greedy #Game_Theory #Weekly_Contest_460
// #2025_08_14_Time_23_ms_(98.36%)_Space_129.60_MB_(75.26%)

import java.util.Arrays;

public class Solution {
    public long maximumMedianSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int m = n / 3;
        long sum = 0;
        for (int i = n - 2; i >= n - 2 * m; i = i - 2) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
