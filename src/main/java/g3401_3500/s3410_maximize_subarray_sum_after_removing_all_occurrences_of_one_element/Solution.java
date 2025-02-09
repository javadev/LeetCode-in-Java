package g3401_3500.s3410_maximize_subarray_sum_after_removing_all_occurrences_of_one_element;

// #Hard #Array #Dynamic_Programming #Segment_Tree
// #2025_01_07_Time_51_ms_(97.96%)_Space_57.22_MB_(85.71%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long maxSubarraySum(int[] nums) {
        Map<Long, Long> prefixMap = new HashMap<>();
        long result = nums[0];
        long prefixSum = 0;
        long minPrefix = 0;
        prefixMap.put(0L, 0L);
        for (int num : nums) {
            prefixSum += num;
            result = Math.max(result, prefixSum - minPrefix);
            if (num < 0) {
                if (prefixMap.containsKey((long) num)) {
                    prefixMap.put(
                            (long) num,
                            Math.min(prefixMap.get((long) num), prefixMap.get(0L)) + num);
                } else {
                    prefixMap.put((long) num, prefixMap.get(0L) + num);
                }
                minPrefix = Math.min(minPrefix, prefixMap.get((long) num));
            }
            prefixMap.put(0L, Math.min(prefixMap.get(0L), prefixSum));
            minPrefix = Math.min(minPrefix, prefixMap.get(0L));
        }
        return result;
    }
}
