package g3301_3400.s3324_find_the_sequence_of_strings_appeared_on_the_screen;

// #Medium #2024_10_21_Time_6_ms_(100.00%)_Space_55.6_MB_(100.00%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> stringSequence(String t) {
        List<String> ans = new ArrayList<>();
        int l = t.length();
        StringBuilder cur = new StringBuilder();
        for (int i = 0; i < l; i++) {
            char tCh = t.charAt(i);
            cur.append('a');
            ans.add(cur.toString());
            while (cur.charAt(i) != tCh) {
                char lastCh = cur.charAt(i);
                char nextCh = (char) (lastCh == 'z' ? 'a' : lastCh + 1);
                cur.setCharAt(i, nextCh);
                ans.add(cur.toString());
            }
        }
        return ans;
    }
}
