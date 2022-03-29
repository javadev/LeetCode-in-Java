package g0901_1000.s0929_unique_email_addresses;

// #Easy #Array #String #Hash_Table #2022_03_29_Time_10_ms_(92.59%)_Space_45.3_MB_(79.48%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < s.length()) {
                char c = s.charAt(i);
                if (c == '+' || c == '@') {
                    sb.append('@');
                    i = s.indexOf("@") + 1;
                    sb.append(s.substring(i));
                    break;
                } else if (c != '.') {
                    sb.append(c);
                }
                i++;
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
