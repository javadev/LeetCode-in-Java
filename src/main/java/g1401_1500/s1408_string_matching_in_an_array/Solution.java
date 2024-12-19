package g1401_1500.s1408_string_matching_in_an_array;

// #Easy #String #String_Matching #2024_12_19_Time_1_ms_(100.00%)_Space_42.7_MB_(5.57%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> matchedStrings = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            boolean containsSubstring = checkContains(words, i);
            if (containsSubstring) {
                matchedStrings.add(words[i]);
            }
        }
        return matchedStrings;
    }

    private boolean checkContains(String[] words, int index) {
        for (int j = 0; j < words.length; j++) {
            if (index == j) {
                continue;
            }
            if (words[j].contains(words[index])) {
                return true;
            }
        }
        return false;
    }
}
