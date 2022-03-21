package g0601_0700.s0609_find_duplicate_file_in_system;

// #Medium #Array #String #Hash_Table #2022_03_21_Time_20_ms_(97.68%)_Space_51.3_MB_(87.10%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] pathComponents = path.split(" ");
            String root = pathComponents[0];
            for (int i = 1; i < pathComponents.length; i++) {
                int startIndex = pathComponents[i].indexOf("(");
                int endIndex = pathComponents[i].lastIndexOf(")");
                String content = pathComponents[i].substring(startIndex, endIndex);

                map.putIfAbsent(content, new ArrayList<>());
                map.get(content).add(root + "/" + pathComponents[i].substring(0, startIndex));
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> list : map.values()) {
            if (list.size() > 1) {
                result.add(list);
            }
        }
        return result;
    }
}
