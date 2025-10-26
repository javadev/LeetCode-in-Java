package g3701_3800.s3728_stable_subarrays_with_equal_boundary_and_interior_sum;

// #Medium #Weekly_Contest_473 #2025_10_26_Time_124_ms_(100.00%)_Space_62.66_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long countStableSubarrays(int[] capacity) {
        long n = capacity.length;
        long res = 0;
        long pre = 0;
        Map<Long, Map<Long, Long>> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mpp.containsKey((long) capacity[i])) {
                Map<Long, Long> t = mpp.get((long) capacity[i]);
                Long cnt = t.get(pre - capacity[i]);
                if (cnt != null) {
                    res += cnt;
                }
            }
            pre += capacity[i];
            Map<Long, Long> t = mpp.computeIfAbsent((long) capacity[i], k -> new HashMap<>());
            t.put(pre, t.getOrDefault(pre, 0L) + 1L);
            if (i > 0 && capacity[i] == 0 && capacity[i - 1] == 0) {
                res--;
            }
        }
        return res;
    }
}
