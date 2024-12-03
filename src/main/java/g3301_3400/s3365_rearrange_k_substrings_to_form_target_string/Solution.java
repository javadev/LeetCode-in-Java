package g3301_3400.s3365_rearrange_k_substrings_to_form_target_string;

// #Medium #String #Hash_Table #Sorting #2024_12_03_Time_59_ms_(94.24%)_Space_49.2_MB_(97.33%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        int size = s.length();
        int div = size / k;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i += div) {
            String sub = s.substring(i, i + div);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }
        for (int i = 0; i < size; i += div) {
            String sub = t.substring(i, i + div);
            if (map.getOrDefault(sub, 0) > 0) {
                map.put(sub, map.get(sub) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
