package g1801_1900.s1832_check_if_the_sentence_is_pangram;

// #Easy #String #Hash_Table #2022_05_07_Time_3_ms_(41.29%)_Space_42.1_MB_(54.65%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> alphabet = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            alphabet.add(c);
        }
        return alphabet.size() == 26;
    }
}
