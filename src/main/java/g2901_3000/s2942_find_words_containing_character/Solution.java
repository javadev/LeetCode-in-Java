package g2901_3000.s2942_find_words_containing_character;

// #Easy #Array #String #2024_01_04_Time_2_ms_(72.65%)_Space_44.8_MB_(14.23%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
