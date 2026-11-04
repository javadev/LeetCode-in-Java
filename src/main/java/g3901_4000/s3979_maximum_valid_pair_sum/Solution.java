package g3901_4000.s3979_maximum_valid_pair_sum;

// #Medium #Array #Enumeration #Senior #Biweekly_Contest_186
// #2026_11_03_Time_2_ms_(59.68%)_Space_118.86_MB_(52.57%)

public class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int res = 0;
        int pre = 0;
        int n = nums.length;
        for (int i = 0; i < n - k; i++) {
            pre = Math.max(pre, nums[i]);
            res = Math.max(res, pre + nums[i + k]);
        }
        return res;
    }
}
