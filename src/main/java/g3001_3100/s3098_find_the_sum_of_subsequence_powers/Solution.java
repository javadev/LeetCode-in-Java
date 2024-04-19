package g3001_3100.s3098_find_the_sum_of_subsequence_powers;

// #Hard #Array #Dynamic_Programming #Sorting #2024_04_19_Time_34_ms_(91.54%)_Space_47.9_MB_(65.64%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final int MOD = 1_000_000_007;
    private int len;

    private int dfs(int lastIdx, int k, int minDiff, Map<Long, Integer> dp, int[] nums) {
        if (k == 0) {
            return minDiff;
        }
        long key = (((long) minDiff) << 12) + ((long) lastIdx << 6) + k;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        int res = 0;
        for (int i = lastIdx + 1; i <= len - k; i++) {
            res = (res + dfs(i, k - 1, Math.min(minDiff, nums[i] - nums[lastIdx]), dp, nums)) % MOD;
        }
        dp.put(key, res);
        return res;
    }

    public int sumOfPowers(int[] nums, int k) {
        len = nums.length;
        Arrays.sort(nums);
        Map<Long, Integer> dp = new HashMap<>();
        int res = 0;
        for (int i = 0; i <= len - k; i++) {
            res = (res + dfs(i, k - 1, nums[len - 1] - nums[0], dp, nums)) % MOD;
        }
        return res;
    }
}
