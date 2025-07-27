package g3601_3700.s3627_maximum_median_sum_of_subsequences_of_size_3;

// #Medium #Weekly_Contest_460 #2025_07_27_Time_22_ms_(100.00%)_Space_129.50_MB_(86.95%)

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
