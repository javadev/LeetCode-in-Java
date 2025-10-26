package g3701_3800.s3729_count_distinct_subarrays_divisible_by_k_in_sorted_array;

// #Hard #Weekly_Contest_473 #2025_10_26_Time_67_ms_(50.00%)_Space_61.73_MB_(50.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long numGoodSubarrays(int[] nums, int k) {
        Map<Integer, Long> cnt = new HashMap<>();
        cnt.put(0, 1L);
        int pre = 0;
        int n = nums.length;
        long res = 0;
        for (int a : nums) {
            pre = (pre + a) % k;
            res += cnt.getOrDefault(pre, 0L);
            cnt.put(pre, cnt.getOrDefault(pre, 0L) + 1L);
        }
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && nums[j] == nums[i]) {
                ++j;
            }
            int l = j - i;
            for (int ll = 1; ll < l; ++ll) {
                if ((long) ll * nums[i] % k == 0) {
                    res -= (l - ll);
                }
            }
            i = j;
        }
        return res;
    }
}
