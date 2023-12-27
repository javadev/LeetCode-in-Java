package g2901_3000.s2910_minimum_number_of_groups_to_create_a_valid_assignment;

// #Medium #Array #Hash_Table #Greedy #2023_12_27_Time_36_ms_(68.99%)_Space_61_MB_(33.33%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minGroupsForValidAssignment(int[] nums) {
        Map<Integer, Integer> count = getCountMap(nums);
        Map<Integer, Integer> countFreq = getCountFrequencyMap(count);
        int minFrequency = getMinFrequency(countFreq);
        for (int size = minFrequency; size >= 1; size--) {
            int group = calculateGroups(countFreq, size);
            if (group > 0) {
                return group;
            }
        }
        return -1;
    }

    private Map<Integer, Integer> getCountMap(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.merge(num, 1, Integer::sum);
        }
        return count;
    }

    private Map<Integer, Integer> getCountFrequencyMap(Map<Integer, Integer> count) {
        Map<Integer, Integer> countFreq = new HashMap<>();
        for (int c : count.values()) {
            countFreq.merge(c, 1, Integer::sum);
        }
        return countFreq;
    }

    private int getMinFrequency(Map<Integer, Integer> countFreq) {
        return countFreq.keySet().stream()
                .min(Integer::compareTo)
                .orElseThrow(() -> new IllegalStateException("Count frequency map is empty"));
    }

    private int calculateGroups(Map<Integer, Integer> countFreq, int size) {
        int group = 0;
        for (Map.Entry<Integer, Integer> entry : countFreq.entrySet()) {
            int len = entry.getKey();
            int rem = len % (size + 1);
            int g = len / (size + 1);
            if (rem == 0) {
                group += g * entry.getValue();
            } else {
                int need = size - rem;
                if (g >= need) {
                    group += (g + 1) * entry.getValue();
                } else {
                    return -1;
                }
            }
        }
        return group;
    }
}
