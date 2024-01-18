package g1201_1300.s1282_group_the_people_given_the_group_size_they_belong_to;

// #Medium #Array #Hash_Table #2022_03_12_Time_6_ms_(79.04%)_Space_54.9_MB_(6.83%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> list = map.getOrDefault(groupSizes[i], new ArrayList<>());
            list.add(i);
            map.put(groupSizes[i], list);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            int i = 0;
            do {
                result.add(list.subList(i, i + entry.getKey()));
                i += entry.getKey();
            } while (i + entry.getKey() <= list.size());
        }
        return result;
    }
}
