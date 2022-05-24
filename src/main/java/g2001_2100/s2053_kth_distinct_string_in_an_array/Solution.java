package g2001_2100.s2053_kth_distinct_string_in_an_array;

// #Easy #Array #Hash Table #String #Counting
// #2022_10_1_Time_6_ms_(80.09%)_Space_42_MB(78.45%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (m.get(arr[i]) == 1) {
                ++c;
                if (c == k) {
                    return arr[i];
                }
            }
        }
        return "";
    }
}
