package g0001_0100.s0049_group_anagrams;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #String #Hash_Table #Sorting
// #Data_Structure_II_Day_8_String #Programming_Skills_II_Day_11 #Udemy_Strings
// #Big_O_Time_O(n*k_log_k)_Space_O(n) #2024_11_11_Time_6_ms_(97.61%)_Space_47.7_MB_(69.56%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String word : strs) {
            char[] freq = new char[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
            String keyString = new String(freq);
            if (!anagrams.containsKey(keyString)) {
                anagrams.put(keyString, new ArrayList<>());
            }
            anagrams.get(keyString).add(word);
        }
        return new ArrayList<>(anagrams.values());
    }
}
