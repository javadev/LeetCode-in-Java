package g1501_1600.s1546_maximum_number_of_non_overlapping_subarrays_with_sum_equals_target;

// #Medium #Array #Hash_Table #Greedy #Prefix_Sum
// #2022_04_11_Time_56_ms_(71.58%)_Space_89_MB_(38.59%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        int culSum = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for (int num : nums) {
            culSum += num;
            if (map.containsKey(culSum - target)) {
                res = Math.max(res, map.get(culSum - target) + 1);
            }
            map.put(culSum, res);
        }
        return res;
    }
}
