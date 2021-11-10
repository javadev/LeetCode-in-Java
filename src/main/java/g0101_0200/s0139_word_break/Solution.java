package g0101_0200.s0139_word_break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        int max = 0;
        boolean[] flag = new boolean[s.length() + 1];
        for (String st : wordDict) {
            set.add(st);
            if (max < st.length()) {
                max = st.length();
            }
        }
        for (int i = 1; i <= max; i++) {
            if (dfs(s, 0, i, max, set, flag)) {
                return true;
            }
        }
        return false;
    }

    public boolean dfs(String s, int start, int end, int max, Set<String> set, boolean[] flag) {
        if (!flag[end] && set.contains(s.substring(start, end))) {
            flag[end] = true;
            if (end == s.length()) {
                return true;
            }
            for (int i = 1; i <= max; i++) {
                if (end + i <= s.length() && dfs(s, end, end + i, max, set, flag)) {
                    return true;
                }
            }
        }
        return false;
    }
}
