package g2001_2100.s2053_kth_distinct_string_in_an_array;

// #Easy #Array #String #Hash_Table #Counting #2022_05_24_Time_7_ms_(65.75%)_Space_44.7_MB_(58.42%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> m = new HashMap<>();
        for (String value : arr) {
            m.put(value, m.getOrDefault(value, 0) + 1);
        }
        int c = 0;
        for (String s : arr) {
            if (m.get(s) == 1) {
                ++c;
                if (c == k) {
                    return s;
                }
            }
        }
        return "";
    }
}
