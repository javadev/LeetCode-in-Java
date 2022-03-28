package g0801_0900.s0890_find_and_replace_pattern;

// #Medium #Array #String #Hash_Table #2022_03_28_Time_1_ms_(97.13%)_Space_42.3_MB_(86.23%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("java:S135")
public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> finalans = new ArrayList<>();
        if (pattern.length() == 1) {
            Collections.addAll(finalans, words);
            return finalans;
        }
        for (String word : words) {
            char[] check = new char[26];
            Arrays.fill(check, '1');
            HashMap<Character, Character> ans = new HashMap<>();
            for (int j = 0; j < word.length(); j++) {
                char pat = pattern.charAt(j);
                char wor = word.charAt(j);
                if (ans.containsKey(pat)) {
                    if (ans.get(pat) == wor) {
                        if (j == word.length() - 1) {
                            finalans.add(word);
                        }
                    } else {
                        break;
                    }
                } else {
                    if (j == word.length() - 1 && check[wor - 'a'] == '1') {
                        finalans.add(word);
                    }
                    if (check[wor - 'a'] != '1' && check[wor - 'a'] != pat) {
                        break;
                    }
                    if (check[wor - 'a'] == '1') {
                        ans.put(pat, wor);
                        check[wor - 'a'] = pat;
                    }
                }
            }
        }
        return finalans;
    }
}
