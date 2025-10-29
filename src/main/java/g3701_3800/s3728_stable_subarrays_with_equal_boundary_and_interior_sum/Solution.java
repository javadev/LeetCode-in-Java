package g3701_3800.s3728_stable_subarrays_with_equal_boundary_and_interior_sum;

// #Medium #Array #Hash_Table #Prefix_Sum #Weekly_Contest_473
// #2025_10_29_Time_71_ms_(98.21%)_Space_61.51_MB_(88.86%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long countStableSubarrays(int[] capacity) {
        long sum = 0;
        Map<Integer, Map<Long, Integer>> map = new HashMap<>();
        int index = 0;
        long ans = 0;
        for (int c : capacity) {
            sum += c;
            Map<Long, Integer> elementMap = map.get(c);
            if (elementMap == null) {
                elementMap = new HashMap<>();
                map.put(c, elementMap);
                elementMap.put(sum, 1);
            } else {
                Integer orDefault = elementMap.getOrDefault(sum - 2 * c, 0);
                elementMap.put(sum, elementMap.getOrDefault(sum, 0) + 1);
                if (c == 0 && capacity[index - 1] == 0) {
                    orDefault--;
                }
                ans += orDefault;
            }
            index++;
        }
        return ans;
    }
}
