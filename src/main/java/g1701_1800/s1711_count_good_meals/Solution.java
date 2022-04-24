package g1701_1800.s1711_count_good_meals;

// #Medium #Array #Hash_Table #2022_04_24_Time_75_ms_(93.77%)_Space_74.5_MB_(63.96%)

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public int countPairs(int[] d) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int k : d) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        long result = 0;
        for (Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<Integer, Integer> elem = it.next();
            int key = elem.getKey();
            long value = elem.getValue();
            for (int j = 21; j >= 0; j--) {
                int find = (1 << j) - key;
                if (find < 0) {
                    break;
                }
                if (map.containsKey(find)) {
                    if (find == key) {
                        result += (((value - 1) * value) / 2);
                    } else {
                        result += (value * map.get(find));
                    }
                }
            }
            it.remove();
        }
        int mod = 1_000_000_007;
        return (int) (result % mod);
    }
}
