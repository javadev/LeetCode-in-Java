package g0201_0300.s0290_word_pattern;

// #Easy #String #Hash_Table

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(words[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), words[i]);
            } else {
                if (!words[i].equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
