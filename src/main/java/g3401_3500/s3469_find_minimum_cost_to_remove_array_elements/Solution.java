package g3401_3500.s3469_find_minimum_cost_to_remove_array_elements;

// #Medium #2025_03_05_Time_12_ms_(100.00%)_Space_45.56_MB_(96.22%)

import java.util.Arrays;

public class Solution {
    private static final int INF = (int) 1e9;

    public int minCost(int[] nums) {
        int n = nums.length;
        if (n % 2 == 0) {
            nums = Arrays.copyOf(nums, ++n);
        }
        int[] dp = new int[n];
        for (int j = 1; j < n - 1; j += 2) {
            int cost1 = INF;
            int cost2 = INF;
            int max = Math.max(nums[j], nums[j + 1]);
            for (int i = 0; i < j; ++i) {
                cost1 = Math.min(cost1, dp[i] + Math.max(nums[i], nums[j + 1]));
                cost2 = Math.min(cost2, dp[i] + Math.max(nums[i], nums[j]));
                dp[i] += max;
            }
            dp[j] = cost1;
            dp[j + 1] = cost2;
        }
        int result = INF;
        for (int i = 0; i < n; ++i) {
            result = Math.min(result, dp[i] + nums[i]);
        }
        return result;
    }
}
