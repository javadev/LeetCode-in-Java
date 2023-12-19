package g2801_2900.s2857_count_pairs_of_points_with_distance_k;

// #Medium #Array #Hash_Table #Bit_Manipulation
// #2023_12_19_Time_250_ms_(84.21%)_Space_68.6_MB_(89.47%)

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int countPairs(List<List<Integer>> c, int k) {
        int ans = 0;
        Map<Long, Integer> map = new HashMap<>();
        for (List<Integer> p : c) {
            int p0 = p.get(0);
            int p1 = p.get(1);
            for (int i = 0; i <= k; i++) {
                int x1 = i ^ p0;
                int y1 = (k - i) ^ p1;
                long key2 = hash(x1, y1);
                if (map.containsKey(key2)) {
                    ans += map.get(key2);
                }
            }
            long key = hash(p0, p1);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return ans;
    }

    private long hash(int x1, int y1) {
        long r = (long) 1e8;
        return x1 * r + y1;
    }
}
