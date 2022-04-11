package g1501_1600.s1560_most_visited_sector_in_a_circular_track;

// #Easy #Array #Simulation #2022_04_11_Time_14_ms_(8.08%)_Space_45_MB_(5.05%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < rounds.length - 1; i++) {
            if (rounds[i] > rounds[i + 1]) {
                if (i == 0) {
                    map.put(rounds[i], 1);
                }
                for (int j = rounds[i] + 1; j <= n; j++) {
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
                for (int j = 1; j <= rounds[i + 1]; j++) {
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
            } else {
                int j;
                if (i == 0) {
                    j = rounds[i];
                } else {
                    j = rounds[i] + 1;
                }
                for (; j <= rounds[i + 1]; j++) {
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
            }
        }

        int mostVisitedCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            mostVisitedCount = Math.max(mostVisitedCount, entry.getValue());
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == mostVisitedCount) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }
}
