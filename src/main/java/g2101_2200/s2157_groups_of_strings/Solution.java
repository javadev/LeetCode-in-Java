package g2101_2200.s2157_groups_of_strings;

// #Hard #String #Bit_Manipulation #Union_Find #2022_06_08_Time_451_ms_(93.86%)_Space_51_MB_(75.44%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] groupStrings(String[] words) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (String word : words) {
            int bitmask = 0;
            for (char ch : word.toCharArray()) {
                bitmask |= (1 << (ch - 'a'));
            }
            map.put(bitmask, map.getOrDefault(bitmask, 0) + 1);
        }
        List<Integer> keyset = new ArrayList<>();
        for (Integer key : map.keySet()) {
            keyset.add(key);
        }
        int totalGroups = 0;
        int maxSize = 0;
        for (Integer key : keyset) {
            if (!map.containsKey(key)) {
                continue;
            }
            totalGroups++;
            int size = dfs(key, map);
            maxSize = Math.max(size, maxSize);
        }
        return new int[] {totalGroups, maxSize};
    }

    private int dfs(Integer key, HashMap<Integer, Integer> map) {
        if (!map.containsKey(key)) {
            return 0;
        }
        int size = map.get(key);
        map.remove(key);
        for (int i = 0; i < 26; i++) {
            size += dfs((key ^ (1 << i)), map);
        }
        for (int i = 0; i < 26; i++) {
            if ((key & (1 << i)) > 0) {
                for (int j = 0; j < 26; j++) {
                    if ((key & (1 << j)) == 0) {
                        size += dfs((key ^ (1 << i) ^ (1 << j)), map);
                    }
                }
            }
        }
        return size;
    }
}
