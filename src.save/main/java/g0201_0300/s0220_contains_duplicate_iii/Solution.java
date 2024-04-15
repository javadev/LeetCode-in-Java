package g0201_0300.s0220_contains_duplicate_iii;

// #Hard #Array #Sorting #Sliding_Window #Ordered_Set #Bucket_Sort
// #2022_07_02_Time_38_ms_(80.90%)_Space_54.1_MB_(52.01%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private long getId(long i, long w) {
        return i < 0 ? (i + 1) / w - 1 : i / w;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0) {
            return false;
        }
        Map<Long, Long> d = new HashMap<>();
        long w = (long) t + 1;
        for (int i = 0; i < nums.length; ++i) {
            long m = getId(nums[i], w);
            if (d.containsKey(m)) {
                return true;
            }
            if (d.containsKey(m - 1) && Math.abs(nums[i] - d.get(m - 1)) < w) {
                return true;
            }
            if (d.containsKey(m + 1) && Math.abs(nums[i] - d.get(m + 1)) < w) {
                return true;
            }
            d.put(m, (long) nums[i]);
            if (i >= k) {
                d.remove(getId(nums[i - k], w));
            }
        }
        return false;
    }
}
