package g1001_1100.s1043_partition_array_for_maximum_sum;

// #Medium #Array #Dynamic_Programming #2022_02_27_Time_5_ms_(90.43%)_Space_41.8_MB_(37.80%)

public class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        for (int right = 0; right < n; right++) {
            int localMax = arr[right];
            for (int left = right; left > Math.max(-1, right - k); left--) {
                localMax = Math.max(localMax, arr[left]);
                if (left == 0) {
                    dp[right] = Math.max(dp[right], (right - left + 1) * localMax);
                } else {
                    dp[right] = Math.max(dp[right], dp[left - 1] + (right - left + 1) * localMax);
                }
            }
        }
        return dp[n - 1];
    }
}
