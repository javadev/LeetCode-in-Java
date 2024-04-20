package g1701_1800.s1773_count_items_matching_a_rule;

// #Easy #Array #String #2022_05_02_Time_3_ms_(98.33%)_Space_46.9_MB_(92.77%)

import java.util.List;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int checkRuleNum = 0;
        if (ruleKey.equals("color")) {
            checkRuleNum = 1;
        } else if (ruleKey.equals("name")) {
            checkRuleNum = 2;
        }
        for (List<String> item : items) {
            if (item.get(checkRuleNum).equals(ruleValue)) {
                ans++;
            }
        }
        return ans;
    }
}
