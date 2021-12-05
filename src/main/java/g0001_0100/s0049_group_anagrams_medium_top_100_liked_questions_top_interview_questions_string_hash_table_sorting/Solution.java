package g0001_0100.s0049_group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();

            Arrays.sort(ch);
            String temp = new String(ch);

            hm.computeIfAbsent(temp, k -> new ArrayList<>());
            hm.get(temp).add(s);
        }

        return (new ArrayList<>(hm.values()));
    }
}
