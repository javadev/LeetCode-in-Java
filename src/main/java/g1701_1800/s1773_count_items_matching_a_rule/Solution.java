package g1701_1800.s1773_count_items_matching_a_rule;

// #Easy #Array #String #2022_04_30_Time_7_ms_(25.91%)_Space_56.9_MB_(35.49%)

import java.util.List;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int match = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
                match++;
            } else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                match++;
            } else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                match++;
            }
        }
        return match;
    }
}
