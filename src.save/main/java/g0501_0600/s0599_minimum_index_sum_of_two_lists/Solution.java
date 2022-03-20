package g0501_0600.s0599_minimum_index_sum_of_two_lists;

// #Easy #Array #String #Hash_Table #2022_03_20_Time_7_ms_(93.97%)_Space_42.8_MB_(89.09%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = 1000000;
        Map<String, Integer> hm = new HashMap<>();
        List<String> result = new ArrayList<>();
        fillMap(list1, hm);
        // find min value
        for (int i = 0; i < list2.length; i++) {
            if (hm.containsKey(list2[i])) {
                int value = hm.get(list2[i]) + i;
                // a new min value was found
                if (value < min) {
                    min = value;
                    // Clean the arraylist
                    result.clear();
                    // add new min value
                    result.add(list2[i]);
                } else if (value == min) {
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public void fillMap(String[] a, Map<String, Integer> hm) {
        for (int i = 0; i < a.length; i++) {
            hm.put(a[i], i);
        }
    }
}
