package g3801_3900.s3868_minimum_cost_to_equalize_arrays_using_swaps;

// #Medium #Array #Hash_Table #Greedy #Counting #Senior #Biweekly_Contest_178
// #2026_07_28_Time_78_ms_(94.70%)_Space_151.84_MB_(77.48%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minCost(int[] a, int[] b) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int x : a) {
            m.merge(x, 1, Integer::sum);
        }
        for (int x : b) {
            m.merge(x, -1, Integer::sum);
        }
        int res = 0;
        for (int v : m.values()) {
            if (v % 2 != 0) {
                return -1;
            }
            if (v > 0) {
                res += v / 2;
            }
        }
        return res;
    }
}
