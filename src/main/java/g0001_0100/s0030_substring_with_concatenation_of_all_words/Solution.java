package g0001_0100.s0030_substring_with_concatenation_of_all_words;

// #Hard #String #Hash_Table #Sliding_Window #Top_Interview_150_Sliding_Window
// #2025_03_04_Time_11_(97.43%)_Space_45.96_(24.38%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int n1 = words[0].length();
        int n2 = s.length();
        Map<String, Integer> map1 = new HashMap<>();
        for (String ch : words) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n1; i++) {
            int left = i;
            int j = i;
            int c = 0;
            Map<String, Integer> map2 = new HashMap<>();
            while (j + n1 <= n2) {
                String word1 = s.substring(j, j + n1);
                j += n1;
                if (map1.containsKey(word1)) {
                    map2.put(word1, map2.getOrDefault(word1, 0) + 1);
                    c++;
                    while (map2.get(word1) > map1.get(word1)) {
                        String word2 = s.substring(left, left + n1);
                        map2.put(word2, map2.get(word2) - 1);
                        left += n1;
                        c--;
                    }
                    if (c == words.length) {
                        ans.add(left);
                    }
                } else {
                    map2.clear();
                    c = 0;
                    left = j;
                }
            }
        }

        return ans;
    }
}
