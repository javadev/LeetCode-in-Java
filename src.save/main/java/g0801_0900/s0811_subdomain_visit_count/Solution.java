package g0801_0900.s0811_subdomain_visit_count;

// #Medium #Array #String #Hash_Table #Counting
// #2022_03_23_Time_5_ms_(100.00%)_Space_42.8_MB_(95.59%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> subdomainVisits(String[] d) {
        Map<String, Integer> fmap = new HashMap<>();
        for (String s : d) {
            int rep = 0;
            int i;
            for (i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    rep = rep * 10 + (c - '0');
                } else {
                    break;
                }
            }
            String str = s.substring(i + 1);
            seperate(rep, str, fmap);
        }
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : fmap.entrySet()) {
            String comp = "";
            comp += entry.getValue();
            comp += " ";
            comp += entry.getKey();
            res.add(comp);
        }
        return res;
    }

    private void seperate(int rep, String s, Map<String, Integer> fmap) {
        int i = s.length() - 1;
        while (i >= 0) {
            String toHash;
            while (i >= 0 && s.charAt(i) != '.') {
                i--;
            }
            toHash = s.substring(i + 1);
            fmap.put(toHash, fmap.getOrDefault(toHash, 0) + rep);
            i--;
        }
    }
}
