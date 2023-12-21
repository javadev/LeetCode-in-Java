package g0401_0500.s0438_find_all_anagrams_in_a_string;

// #Medium #Top_100_Liked_Questions #String #Hash_Table #Sliding_Window
// #Algorithm_II_Day_5_Sliding_Window #Programming_Skills_II_Day_12
// #Level_1_Day_12_Sliding_Window/Two_Pointer #Big_O_Time_O(n+m)_Space_O(1)
// #2022_07_16_Time_6_ms_(99.03%)_Space_47.9_MB_(50.50%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] map = new int[26];
        for (int i = 0; i < p.length(); ++i) {
            map[p.charAt(i) - 'a']++;
        }
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            int idx = s.charAt(i) - 'a';
            // add the new character
            map[idx]--;
            // if the length is greater than windows length, pop the left charcater in the window
            if (i >= p.length()) {
                map[s.charAt(j++) - 'a']++;
            }
            boolean finish = true;
            for (int k = 0; k < 26; k++) {
                // if it is not an anagram of string p
                if (map[k] != 0) {
                    finish = false;
                    break;
                }
            }
            if (i >= p.length() - 1 && finish) {
                res.add(j);
            }
            i++;
        }
        return res;
    }
}
