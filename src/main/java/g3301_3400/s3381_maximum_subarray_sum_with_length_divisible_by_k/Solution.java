package g3301_3400.s3381_maximum_subarray_sum_with_length_divisible_by_k;

// #Medium #Array #Hash_Table #Prefix_Sum #2024_12_10_Time_4_ms_(100.00%)_Space_80.2_MB_(22.05%)

public class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] maxSum = new long[n];
        long minSum = 0;
        for (int i = n - 1; i > n - k; i--) {
            maxSum[i] = Integer.MIN_VALUE;
            minSum += nums[i];
        }
        minSum += nums[n - k];
        maxSum[n - k] = minSum;
        long ans = minSum;
        for (int i = n - k - 1; i >= 0; i--) {
            minSum = minSum + nums[i] - nums[i + k];
            maxSum[i] = Math.max(minSum, minSum + maxSum[i + k]);
            ans = Math.max(maxSum[i], ans);
        }
        return ans;
    }
}
