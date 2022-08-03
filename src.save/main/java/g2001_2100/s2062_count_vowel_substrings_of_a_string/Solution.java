package g2001_2100.s2062_count_vowel_substrings_of_a_string;

// #Easy #String #Hash_Table #2022_05_29_Time_34_ms_(23.83%)_Space_41.9_MB_(71.28%)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Set<Character> window = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            window.clear();
            if (vowels.contains(word.charAt(i))) {
                window.add(word.charAt(i));
                for (int j = i + 1; j < word.length(); j++) {
                    if (!vowels.contains(word.charAt(j))) {
                        break;
                    } else {
                        window.add(word.charAt(j));
                        if (window.size() == 5) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
