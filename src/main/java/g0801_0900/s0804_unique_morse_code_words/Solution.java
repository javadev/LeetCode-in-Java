package g0801_0900.s0804_unique_morse_code_words;

// #Easy #Array #String #Hash_Table #2022_03_23_Time_2_ms_(89.27%)_Space_41.9_MB_(64.05%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder temp = new StringBuilder();
            for (char c : word.toCharArray()) {
                temp.append(morse[c - 'a']);
            }
            set.add(temp.toString());
        }
        return set.size();
    }
}
