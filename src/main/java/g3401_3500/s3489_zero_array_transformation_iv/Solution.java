package g3401_3500.s3489_zero_array_transformation_iv;

// #Medium #2025_03_16_Time_136_ms_(100.00%)_Space_55.84_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    private int solve(int[][] q, int i, int target, int k, int[][] dp) {
        // we found  a valid sum equal to target so return current index of query.
        if (target == 0) {
            return k;
        }
        // return a larger number to invalidate this flow
        if (k >= q.length || target < 0) {
            return q.length + 1;
        }
        if (dp[target][k] != -1) {
            return dp[target][k];
        }
        // skip current query val
        int res = solve(q, i, target, k + 1, dp);
        // pick the val if its range is in the range of target index
        if (q[k][0] <= i && i <= q[k][1]) {
            res = Math.min(res, solve(q, i, target - q[k][2], k + 1, dp));
        }
        dp[target][k] = res;
        return res;
    }

    public int minZeroArray(int[] nums, int[][] queries) {
        int ans = -1;
        for (int i = 0; i < nums.length; ++i) {
            int[][] dp = new int[nums[i] + 1][queries.length];
            Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
            ans = Math.max(ans, solve(queries, i, nums[i], 0, dp));
        }
        return (ans > queries.length) ? -1 : ans;
    }
}
