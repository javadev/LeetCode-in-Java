package g3501_3600.s3584_maximum_product_of_first_and_last_elements_of_a_subsequence;

// #Medium #2025_06_16_Time_4_ms_(87.17%)_Space_61.31_MB_(100.00%)

public class Solution {
    public long maximumProduct(int[] nums, int m) {
        long ma = nums[0];
        long mi = nums[0];
        long res = (long) nums[0] * nums[m - 1];
        for (int i = m - 1; i < nums.length; ++i) {
            ma = Math.max(ma, nums[i - m + 1]);
            mi = Math.min(mi, nums[i - m + 1]);
            res = Math.max(res, Math.max(mi * nums[i], ma * nums[i]));
        }
        return res;
    }
}
