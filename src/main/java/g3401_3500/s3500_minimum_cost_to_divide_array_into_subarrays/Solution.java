package g3401_3500.s3500_minimum_cost_to_divide_array_into_subarrays;

// #Hard #2025_03_30_Time_225_ms_(94.64%)_Space_62.54_MB_(58.93%)

import java.util.Arrays;

@SuppressWarnings("java:S107")
public class Solution {
    public long minimumCost(int[] nums, int[] cost, int k) {
        int n = nums.length;
        long[] prefixNums = new long[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
            prefixNums[i] = total;
        }
        long[] prefixCost = new long[n + 1];
        total = 0;
        for (int i = 0; i < n; i++) {
            total += cost[i];
            prefixCost[i + 1] = total;
        }
        long[][] memo = new long[n][n + 1];
        for (long[] row : memo) {
            Arrays.fill(row, -1);
        }
        int[] bestSplit = new int[n];
        Arrays.fill(bestSplit, -1);
        return rec(0, 1, nums, prefixNums, prefixCost, k, memo, bestSplit);
    }

    private long rec(
            int index,
            int i,
            int[] nums,
            long[] prefixNums,
            long[] prefixCost,
            int k,
            long[][] memo,
            int[] bestSplit) {
        int n = nums.length;
        if (index == n) {
            return 0;
        }
        if (memo[index][i] != -1) {
            return memo[index][i];
        }
        if (bestSplit[index] != -1) {
            int j = bestSplit[index];
            long val =
                    (prefixNums[j] + (long) k * i) * (prefixCost[j + 1] - prefixCost[index])
                            + rec(j + 1, i + 1, nums, prefixNums, prefixCost, k, memo, bestSplit);
            memo[index][i] = val;
            return val;
        }
        long best = Long.MAX_VALUE;
        int bestIndex = -1;
        for (int j = index; j < n; j++) {
            long val =
                    (prefixNums[j] + (long) k * i) * (prefixCost[j + 1] - prefixCost[index])
                            + rec(j + 1, i + 1, nums, prefixNums, prefixCost, k, memo, bestSplit);
            if (val < best) {
                best = val;
                bestIndex = j;
            }
        }
        bestSplit[index] = bestIndex;
        memo[index][i] = best;
        return best;
    }
}
