package g1801_1900.s1807_evaluate_the_bracket_pairs_of_a_string;

// #Medium #Array #String #Hash_Table #2022_05_03_Time_40_ms_(80.47%)_Space_79.8_MB_(96.48%)

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> knowledgeMapper = new HashMap<>();
        for (List<String> pair : knowledge) {
            knowledgeMapper.put(pair.get(0), pair.get(1));
        }
        StringBuilder answer = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char letter = s.charAt(i);
            if (letter == '(') {
                StringBuilder key = new StringBuilder();
                letter = s.charAt(++i);
                while (letter != ')') {
                    key.append(letter);
                    letter = s.charAt(++i);
                }
                answer.append(knowledgeMapper.getOrDefault(key.toString(), "?"));
            } else {
                answer.append(letter);
            }
            i++;
        }
        return answer.toString();
    }
}
