package g0801_0900.s0804_unique_morse_code_words;

// #Easy #Array #String #Hash_Table

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
