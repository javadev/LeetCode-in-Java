package g3301_3400.s3356_zero_array_transformation_ii;

// #Medium #2024_11_18_Time_22_ms_(100.00%)_Space_113.5_MB_(100.00%)

public class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int total = 0;
        int l = 0;
        int h = queries.length - 1;
        for (int i : nums) {
            total += i;
        }
        if (total == 0) {
            return 0;
        }
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (isPossible(nums, queries, total, m)) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return h + 2 > queries.length ? -1 : h + 2;
    }

    private boolean isPossible(int[] nums, int[][] queries, int total, int k) {
        int[] res = new int[nums.length + 1];
        int sum = 0;
        for (int i = 0; i <= k; i++) {
            int[] q = queries[i];
            res[q[0]] += q[2];
            res[q[1] + 1] -= q[2];
        }
        for (int i = 0; i < nums.length; i++) {
            sum += res[i];
            if (nums[i] - sum > 0) {
                return false;
            }
            total -= nums[i];
        }
        return total == 0;
    }
}
