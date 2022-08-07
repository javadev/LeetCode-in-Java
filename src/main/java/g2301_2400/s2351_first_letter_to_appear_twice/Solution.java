package g2301_2400.s2351_first_letter_to_appear_twice;

// #Easy #Hash_Table #String #Counting #2022_08_07_Time_1_ms_(63.38%)_Space_41.7_MB_(82.50%)

import java.util.HashMap;

public class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) >= 1) {
                    return s.charAt(i);
                }
            } else {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        return 'c';
    }
}
