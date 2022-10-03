package g1401_1500.s1408_string_matching_in_an_array;

// #Easy #String #String_Matching #2022_03_26_Time_8_ms_(24.88%)_Space_43.3_MB_(13.46%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            for (String s : words) {
                if (!word.equals(s) && word.length() < s.length() && s.contains(word)) {
                    set.add(word);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
