package g0801_0900.s0811_subdomain_visit_count;

// #Medium #Array #String #Hash_Table #Counting

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> subdomainVisits(String[] d) {
        HashMap<String, Integer> fmap = new HashMap<>();
        for (String s : d) {
            int rep = 0;
            int i = 0;
            for (i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    rep = rep * 10 + (c - '0');
                } else {
                    break;
                }
            }
            String str = s.substring(i + 1);
            Seperate(rep, str, fmap);
        }
        List<String> res = new ArrayList<>();
        for (String key : fmap.keySet()) {
            String comp = "";
            comp += fmap.get(key);
            comp += " ";
            comp += key;
            res.add(comp);
        }
        return res;
    }

    private void Seperate(int rep, String s, HashMap<String, Integer> fmap) {
        for (int i = s.length() - 1; i >= 0; i--) {
            String to_Hash = "";
            while (i >= 0 && s.charAt(i) != '.') {
                i--;
            }
            to_Hash = s.substring(i + 1);
            fmap.put(to_Hash, fmap.getOrDefault(to_Hash, 0) + rep);
        }
    }
}
