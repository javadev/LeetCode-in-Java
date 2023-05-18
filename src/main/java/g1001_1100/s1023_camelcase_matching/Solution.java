package g1001_1100.s1023_camelcase_matching;

// #Medium #String #Two_Pointers #Trie #String_Matching
// #2022_02_26_Time_1_ms_(73.86%)_Space_43_MB_(6.82%)

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ret = new LinkedList<>();
        for (String query : queries) {
            ret.add(check(query, pattern));
        }
        return ret;
    }

    private Boolean check(String query, String pattern) {
        int patternLen = pattern.length();
        int patternPos = 0;
        int uppercaseCount = 0;
        for (int i = 0; i < query.length(); i++) {
            char c = query.charAt(i);
            if (Character.isUpperCase(c)) {
                if (patternPos < patternLen && c != pattern.charAt(patternPos)) {
                    return false;
                }
                uppercaseCount++;
                if (uppercaseCount > patternLen) {
                    return false;
                }
                patternPos++;
            } else {
                if (patternPos < patternLen && c == pattern.charAt(patternPos)) {
                    patternPos++;
                }
            }
        }

        return patternPos == patternLen;
    }
}
