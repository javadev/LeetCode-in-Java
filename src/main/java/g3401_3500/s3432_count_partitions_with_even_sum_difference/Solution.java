package g3401_3500.s3432_count_partitions_with_even_sum_difference;

// #Easy #Array #Math #Prefix_Sum #2025_01_27_Time_1_ms_(100.00%)_Space_41.86_MB_(100.00%)

public class Solution {
    public int countPartitions(int[] nums) {
        int ct = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j <= i; j++) {
                sum1 += nums[j];
            }
            for (int k = i + 1; k < n; k++) {
                sum2 += nums[k];
            }
            if (Math.abs(sum1 - sum2) % 2 == 0) {
                ct++;
            }
        }
        return ct;
    }
}
