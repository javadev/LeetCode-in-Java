package g3801_3900.s3850_count_sequences_to_k;

// #Hard #Array #Dynamic_Programming #Math #Memoization #Number_Theory #Senior_Staff
// #Weekly_Contest_490 #2026_07_22_Time_144_ms_(90.24%)_Space_64.70_MB_(29.27%)

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<Double, Integer>[] dp;

    private int fun(int[] nums, int pos, double val, double k) {
        if (pos == nums.length) {
            if (Math.abs(val - k) <= 0.000000009) {
                return 1;
            }
            return 0;
        }
        if (dp[pos].containsKey(val)) {
            return dp[pos].get(val);
        }
        int ret = fun(nums, pos + 1, val, k);
        ret += fun(nums, pos + 1, val * nums[pos], k);
        ret += fun(nums, pos + 1, val / nums[pos], k);
        dp[pos].put(val, ret);
        return ret;
    }

    public int countSequences(int[] nums, long k) {
        dp = new HashMap[22];
        for (int i = 0; i < 22; i++) {
            dp[i] = new HashMap<>();
        }
        return fun(nums, 0, 1.0, 1.00 * k);
    }
}
