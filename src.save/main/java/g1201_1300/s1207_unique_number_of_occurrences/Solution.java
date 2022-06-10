package g1201_1300.s1207_unique_number_of_occurrences;

// #Easy #Array #Hash_Table #2022_04_29_Time_2_ms_(82.71%)_Space_42.4_MB_(34.08%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // map for check unique number of count
        Map<Integer, Integer> uni = new HashMap<>();
        for (Integer val : map.values()) {
            if (uni.containsKey(val)) {
                return false;
            } else {
                uni.put(val, 1);
            }
        }
        return true;
    }
}
