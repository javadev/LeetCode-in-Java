package g3301_3400.s3306_count_of_substrings_containing_every_vowel_and_k_consonants_ii;

// #Medium #String #Hash_Table #Sliding_Window
// #2024_10_01_Time_340_ms_(44.09%)_Space_46.3_MB_(62.47%)

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public long countOfSubstrings(String word, int k) {
        return countOfSubstringHavingAtleastXConsonants(word, k)
                - countOfSubstringHavingAtleastXConsonants(word, k + 1);
    }

    private long countOfSubstringHavingAtleastXConsonants(String word, int k) {
        int start = 0;
        int end = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int consonants = 0;
        Map<Character, Integer> map = new HashMap<>();
        long res = 0;
        while (end < word.length()) {
            char ch = word.charAt(end);
            // adding vowel or consonants;
            if (vowels.contains(ch)) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            } else {
                consonants++;
            }
            // checking any valid string ispresent or not
            while (map.size() == 5 && consonants >= k) {
                res += word.length() - end;
                char ch1 = word.charAt(start);
                if (vowels.contains(ch1)) {
                    int temp = map.get(ch1) - 1;
                    if (temp == 0) {
                        map.remove(ch1);
                    } else {
                        map.put(ch1, temp);
                    }
                } else {
                    consonants--;
                }
                start++;
            }
            end++;
        }
        return res;
    }
}
