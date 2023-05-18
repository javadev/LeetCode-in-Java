package g0001_0100.s0049_group_anagrams;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #String #Hash_Table #Sorting
// #Data_Structure_II_Day_8_String #Programming_Skills_II_Day_11 #Udemy_Strings
// #2022_06_16_Time_11_ms_(71.16%)_Space_55.9_MB_(50.54%)

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
