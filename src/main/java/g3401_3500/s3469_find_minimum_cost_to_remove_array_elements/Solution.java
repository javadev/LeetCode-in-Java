package g3401_3500.s3469_find_minimum_cost_to_remove_array_elements;

// #Medium #2025_03_02_Time_540_ms_(100.00%)_Space_57.03_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    private int[][] dp;

    public int minCost(int[] nums) {
        dp = new int[1001][1001];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        return solve(nums, 1, 0);
    }

    private int solve(int[] nums, int i, int last) {
        if (i + 1 >= nums.length) {
            return Math.max(nums[last], (i < nums.length ? nums[i] : 0));
        }
        if (dp[i][last] != -1) {
            return dp[i][last];
        }
        int res = Math.max(nums[i], nums[i + 1]) + solve(nums, i + 2, last);
        res = Math.min(res, Math.max(nums[i], nums[last]) + solve(nums, i + 2, i + 1));
        res = Math.min(res, Math.max(nums[i + 1], nums[last]) + solve(nums, i + 2, i));
        return dp[i][last] = res;
    }
}
