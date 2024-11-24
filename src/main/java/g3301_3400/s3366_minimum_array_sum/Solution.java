package g3301_3400.s3366_minimum_array_sum;

// #Medium #2024_11_24_Time_66_ms_(100.00%)_Space_55_MB_(100.00%)

public class Solution {
    public int minArraySum(int[] nums, int k, int op1, int op2) {
        Integer[][][] dp = new Integer[nums.length][op1 + 1][op2 + 1];
        return sub(dp, nums, 0, k, op1, op2);
    }

    private int sub(Integer[][][] dp, int[] nums, int i, int k, int op1, int op2) {
        if (i == nums.length) {
            return 0;
        }
        if (dp[i][op1][op2] != null) {
            return dp[i][op1][op2];
        }
        int res = sub(dp, nums, i + 1, k, op1, op2) + nums[i];
        if (nums[i] >= k && op2 > 0) {
            res = Math.min(res, sub(dp, nums, i + 1, k, op1, op2 - 1) + nums[i] - k);
            int v = (int) Math.ceil(nums[i] / 2.0);
            if (v < k) {
                v = (int) Math.ceil((nums[i] - k) / 2.0);
            } else {
                v -= k;
            }
            if (op1 > 0) {
                res = Math.min(res, sub(dp, nums, i + 1, k, op1 - 1, op2 - 1) + v);
            }
        }
        if (op1 > 0) {
            int v = (int) Math.ceil(nums[i] / 2.0);
            res = Math.min(res, sub(dp, nums, i + 1, k, op1 - 1, op2) + v);
        }
        return dp[i][op1][op2] = res;
    }
}
