package g3001_3100.s3020_find_the_maximum_number_of_elements_in_subset;

// #Medium #Array #Hash_Table #Enumeration #2024_02_29_Time_51_ms_(94.80%)_Space_57_MB_(41.88%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maximumLength(int[] nums) {
        return withHashMap(nums);
    }

    private int withHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        if (map.containsKey(1)) {
            if (map.get(1) % 2 == 0) {
                ans = map.get(1) - 1;
            } else {
                ans = map.get(1);
            }
        }
        for (int key : map.keySet()) {
            if (key == 1) {
                continue;
            }
            int len = findSeries(map, key);
            ans = Math.max(ans, len);
        }
        return ans;
    }

    private int findSeries(Map<Integer, Integer> map, int key) {
        int sqr = key * key;
        if (map.containsKey(sqr)) {
            if (map.get(key) >= 2) {
                return 2 + findSeries(map, sqr);
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}
