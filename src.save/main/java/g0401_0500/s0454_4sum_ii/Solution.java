package g0401_0500.s0454_4sum_ii;

// #Medium #Top_Interview_Questions #Array #Hash_Table
// #2022_03_18_Time_157_ms_(74.79%)_Space_57.5_MB_(49.91%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : nums3) {
            for (int i : nums4) {
                int sum = k + i;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for (int k : nums1) {
            for (int i : nums2) {
                int m = -(k + i);
                count += map.getOrDefault(m, 0);
            }
        }
        return count;
    }
}
