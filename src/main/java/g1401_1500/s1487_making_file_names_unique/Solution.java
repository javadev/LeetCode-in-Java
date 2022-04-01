package g1401_1500.s1487_making_file_names_unique;

// #Medium #Array #String #Hash_Table #2022_04_01_Time_36_ms_(98.46%)_Space_50.7_MB_(97.99%)

import java.util.HashMap;

public class Solution {
    public String[] getFolderNames(String[] names) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            int prefix = map.getOrDefault(names[i], 0);
            if (prefix != 0) {
                String raw = names[i];
                while (map.getOrDefault(names[i], 0) != 0) {
                    names[i] = raw + "(" + prefix + ")";
                    prefix++;
                }
                map.put(raw, prefix);
            }
            map.put(names[i], 1);
        }
        return names;
    }
}
