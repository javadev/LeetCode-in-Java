package g0401_0500.s0438_find_all_anagrams_in_a_string;

// #Medium #Top_100_Liked_Questions #String #Hash_Table #Sliding_Window
// #Algorithm_II_Day_5_Sliding_Window #Programming_Skills_II_Day_12
// #Level_1_Day_12_Sliding_Window/Two_Pointer #2022_03_18_Time_8_ms_(87.18%)_Space_48_MB_(43.23%)

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
