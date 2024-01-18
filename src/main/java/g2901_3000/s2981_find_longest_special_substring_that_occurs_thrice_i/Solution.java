package g2901_3000.s2981_find_longest_special_substring_that_occurs_thrice_i;

// #Medium #String #Hash_Table #Binary_Search #Counting #Sliding_Window
// #2024_01_18_Time_6_ms_(89.21%)_Space_44.5_MB_(72.61%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int maximumLength(String s) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            buckets.add(new ArrayList<>());
        }
        int cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                int index = s.charAt(i - 1) - 'a';
                buckets.get(index).add(cur);
                cur = 1;
            } else {
                cur++;
            }
        }
        int endIndex = s.charAt(s.length() - 1) - 'a';
        buckets.get(endIndex).add(cur);
        int result = -1;
        for (List<Integer> bucket : buckets) {
            result = Math.max(result, generate(bucket));
        }
        return result;
    }

    private int generate(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < list.size() && i < 3; i++) {
            int cur = list.get(i);
            int num = map.getOrDefault(cur, 0);
            map.put(cur, num + 1);
            if (cur >= 2) {
                num = map.getOrDefault(cur - 1, 0);
                map.put(cur - 1, num + 2);
            }
            if (cur >= 3) {
                num = map.getOrDefault(cur - 2, 0);
                map.put(cur - 2, num + 3);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 3) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
