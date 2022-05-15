package g1401_1500.s1460_make_two_arrays_equal_by_reversing_sub_arrays;

// #Easy #Array #Hash_Table #Sorting #Acceptance_72.5%
// #2022_03_29_Time_13_ms_(14.65%)_Space_47.6_MB_(22.39%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : target) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (!map.containsKey(num)) {
                return false;
            } else {
                map.put(num, map.get(num) - 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
