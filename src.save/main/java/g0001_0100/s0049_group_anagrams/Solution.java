package g0001_0100.s0049_group_anagrams;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Sorting
// #Acceptance_64.3% #Data_Structure_II_Day_8_String #Programming_Skills_II_Day_11
// #2022_02_18_Time_10_ms_(74.79%)_Space_56.1_MB_(20.82%)

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
