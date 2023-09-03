package g0901_1000.s1000_minimum_cost_to_merge_stones;

// #Hard #Array #Dynamic_Programming #2022_04_20_Time_1_ms_(99.65%)_Space_41.5_MB_(82.62%)

import java.util.Arrays;

public class Solution {
    private int[][] memo;
    private int[] prefixSum;

    public int mergeStones(int[] stones, int k) {
        int n = stones.length;
        if ((n - 1) % (k - 1) != 0) {
            return -1;
        }
        memo = new int[n][n];
        for (int[] arr : memo) {
            Arrays.fill(arr, -1);
        }
        prefixSum = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            prefixSum[i] = prefixSum[i - 1] + stones[i - 1];
        }
        return dp(0, n - 1, k);
    }

    private int dp(int left, int right, int k) {
        if (memo[left][right] > 0) {
            return memo[left][right];
        }
        if (right - left + 1 < k) {
            memo[left][right] = 0;
            return memo[left][right];
        }
        if (right - left + 1 == k) {
            memo[left][right] = prefixSum[right + 1] - prefixSum[left];
            return memo[left][right];
        }
        int val = Integer.MAX_VALUE;
        for (int i = 0; left + i + 1 <= right; i += k - 1) {
            val = Math.min(val, dp(left, left + i, k) + dp(left + i + 1, right, k));
        }
        if ((right - left) % (k - 1) == 0) {
            val += prefixSum[right + 1] - prefixSum[left];
        }
        memo[left][right] = val;
        return val;
    }
}
