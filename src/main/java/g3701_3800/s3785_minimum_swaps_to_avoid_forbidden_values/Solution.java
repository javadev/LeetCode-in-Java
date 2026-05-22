package g3701_3800.s3785_minimum_swaps_to_avoid_forbidden_values;

// #Hard #Array #Hash_Table #Greedy #Counting #Senior_Staff #Weekly_Contest_481
// #2026_05_22_Time_88_ms_(86.89%)_Space_159.68_MB_(81.97%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minSwaps(int[] nums, int[] forbidden) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : forbidden) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int val : map.values()) {
            if (val > n) {
                return -1;
            }
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == forbidden[i]) {
                map2.put(nums[i], map2.getOrDefault(nums[i], 0) + 1);
                total++;
            }
        }
        if (total == 0) {
            return 0;
        }
        int maxSwaps = 0;
        for (int num : map2.values()) {
            maxSwaps = Math.max(maxSwaps, num);
        }
        return Math.max(maxSwaps, (total + 1) / 2);
    }
}
