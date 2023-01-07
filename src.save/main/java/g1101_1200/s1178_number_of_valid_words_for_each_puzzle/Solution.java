package g1101_1200.s1178_number_of_valid_words_for_each_puzzle;

// #Hard #Array #String #Hash_Table #Bit_Manipulation #Trie
// #2022_03_03_Time_139_ms_(48.41%)_Space_99.3_MB_(21.66%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (String word : words) {
            int wordmask = createMask(word);
            if (map.containsKey(wordmask)) {
                int oldfreq = map.get(wordmask);
                int newfreq = oldfreq + 1;
                map.put(wordmask, newfreq);
            } else {
                map.put(wordmask, 1);
            }
        }
        for (String puzzle : puzzles) {
            int puzzlemask = createMask(puzzle);
            char firstChar = puzzle.charAt(0);
            int first = 1 << (firstChar - 'a');
            int sub = puzzlemask;
            int count = 0;
            while (sub != 0) {
                boolean firstCharPresent = (sub & first) == first;
                boolean wordvalid = map.containsKey(sub);
                if (firstCharPresent && wordvalid) {
                    count += map.get(sub);
                }

                sub = (sub - 1) & puzzlemask;
            }
            ans.add(count);
        }
        return ans;
    }

    private int createMask(String str) {
        int mask = 0;
        for (int i = 0; i < str.length(); i++) {
            int bit = str.charAt(i) - 'a';
            mask = (mask | (1 << bit));
        }
        return mask;
    }
}
