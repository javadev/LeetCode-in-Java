package g3901_4000.s3919_minimum_cost_to_move_between_indices;

// #Medium #Array #Greedy #Prefix_Sum #Staff #Weekly_Contest_500
// #2026_09_15_Time_4_ms_(100.00%)_Space_187.52_MB_(54.12%)

public class Solution {
    public int[] minCost(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        prefixSum[1] = 1;
        for (int i = 1; i < n - 1; i++) {
            int left = Math.abs(nums[i] - nums[i - 1]);
            int right = Math.abs(nums[i] - nums[i + 1]);
            if (left <= right) {
                prefixSum[i + 1] = prefixSum[i] + right;
                suffixSum[i] = suffixSum[i - 1] + 1;
            } else if (left > right) {
                prefixSum[i + 1] = prefixSum[i] + 1;
                suffixSum[i] = suffixSum[i - 1] + left;
            }
        }
        suffixSum[n - 1] = suffixSum[n - 2] + 1;
        int[] ans = new int[queries.length];
        int i = 0;
        for (int[] qur : queries) {
            int l = qur[0];
            int r = qur[1];
            if (l > r) {
                ans[i++] = suffixSum[l] - suffixSum[r];
            } else {
                ans[i++] = prefixSum[r] - prefixSum[l];
            }
        }
        return ans;
    }
}
