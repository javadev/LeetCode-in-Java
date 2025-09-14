package g3601_3700.s3679_minimum_discards_to_balance_inventory;

// #Medium #Biweekly_Contest_165 #2025_09_14_Time_30_ms_(100.00%)_Space_61.57_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int n = arrivals.length;
        if (n == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int[] kept = new int[n];
        int dis = 0;
        for (int i = 0; i < n; i++) {
            int idx = i - w;
            if (idx >= 0 && kept[idx] == 1) {
                map.put(arrivals[idx], map.get(arrivals[idx]) - 1);
            }
            int t = arrivals[i];
            if (map.getOrDefault(t, 0) < m) {
                kept[i] = 1;
                map.put(t, map.getOrDefault(t, 0) + 1);
            } else {
                dis++;
            }
        }
        return dis;
    }
}
