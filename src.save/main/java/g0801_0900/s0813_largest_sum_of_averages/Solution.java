package g0801_0900.s0813_largest_sum_of_averages;

// #Medium #Array #Dynamic_Programming #2022_03_23_Time_4_ms_(97.01%)_Space_42.5_MB_(18.51%)

public class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        return helper(nums, k, 0, new Double[k + 1][nums.length]);
    }

    private double helper(int[] nums, int k, int idx, Double[][] memo) {
        if (memo[k][idx] != null) {
            return memo[k][idx];
        }
        double maxAvg = 0;
        double sum = 0;
        for (int i = idx; i <= nums.length - k; i++) {
            sum += nums[i];
            if (k - 1 > 0) {
                maxAvg = Math.max(maxAvg, (sum / (i - idx + 1)) + helper(nums, k - 1, i + 1, memo));
            } else if (i == nums.length - 1) {
                maxAvg = Math.max(maxAvg, sum / (i - idx + 1));
            }
        }
        memo[k][idx] = maxAvg;
        return maxAvg;
    }
}
