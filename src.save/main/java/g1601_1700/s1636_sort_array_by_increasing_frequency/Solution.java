package g1601_1700.s1636_sort_array_by_increasing_frequency;

// #Easy #Array #Hash_Table #Sorting #2022_04_20_Time_7_ms_(75.30%)_Space_44.4_MB_(61.24%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int freq = entry.getValue();
            map.putIfAbsent(freq, new ArrayList<>());
            List<Integer> list = map.get(freq);
            list.add(entry.getKey());
            map.put(freq, list);
        }
        int[] result = new int[nums.length];
        int i = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            list.sort(Collections.reverseOrder());
            int k = entry.getKey();
            for (int j = 0; j < list.size(); j++, k = entry.getKey()) {
                while (k-- > 0) {
                    result[i++] = list.get(j);
                }
            }
        }
        return result;
    }
}
