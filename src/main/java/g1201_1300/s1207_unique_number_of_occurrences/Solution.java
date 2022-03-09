package g1201_1300.s1207_unique_number_of_occurrences;

// #Easy #Array #Hash_Table #2022_03_09_Time_8_ms_(5.98%)_Space_42.4_MB_(22.63%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr)
                .forEach(
                        num -> {
                            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
                        });
        Set<Integer> set = new HashSet<>();
        return map.keySet().stream().mapToInt(key -> key).allMatch(key -> set.add(map.get(key)));
    }
}
