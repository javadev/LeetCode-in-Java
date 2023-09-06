package g0001_0100.s0049_group_anagrams;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #String #Hash_Table #Sorting
// #Data_Structure_II_Day_8_String #Programming_Skills_II_Day_11 #Udemy_Strings
// #Big_O_Time_O(n*k_log_k)_Space_O(n) #2023_08_11_Time_6_ms_(92.28%)_Space_46.4_MB_(98.50%)

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
