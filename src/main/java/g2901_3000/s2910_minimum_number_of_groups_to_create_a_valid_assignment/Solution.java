package g2901_3000.s2910_minimum_number_of_groups_to_create_a_valid_assignment;

// #Medium #Array #Hash_Table #Greedy #2023_12_27_Time_33_ms_(93.62%)_Space_60.9_MB_(34.20%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int groupBySize(Map<Integer, Integer> countFreq, int size, int n) {
        int group = 0;
        for (Map.Entry<Integer, Integer> e : countFreq.entrySet()) {
            int len = e.getKey();
            int rem = len % (size + 1);
            int g = len / (size + 1);

            if (rem == 0) {
                group += g * e.getValue();
                continue;
            }

            int need = size - rem;
            if (g >= need) {
                group += (g + 1) * e.getValue();
                continue;
            }
            return -1;
        }
        return group;
    }

    public int minGroupsForValidAssignment(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.merge(num, 1, Integer::sum);
        }
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> countFreq = new HashMap<>();
        for (int c : count.values()) {
            countFreq.merge(c, 1, Integer::sum);
        }
        for (int c : countFreq.keySet()) {
            min = Math.min(min, c);
        }
        for (int size = min; size >= 1; size--) {
            int group = groupBySize(countFreq, size, n);
            if (group > 0) {
                return group;
            }
        }
        return -1;
    }
}
