package g0801_0900.s0890_find_and_replace_pattern;

// #Medium #Array #String #Hash_Table

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
        for (int i = 0; i < words.length; i++) {
            char[] check = new char[26];
            Arrays.fill(check, '1');
            HashMap<Character, Character> ans = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                char pat = pattern.charAt(j);
                char wor = words[i].charAt(j);
                if (ans.containsKey(pat)) {
                    if (ans.get(pat) == wor) {
                        if (j == words[i].length() - 1) {
                            finalans.add(words[i]);
                        }
                    } else {
                        break;
                    }
                } else {
                    if (j == words[i].length() - 1 && check[wor - 'a'] == '1') {
                        finalans.add(words[i]);
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
