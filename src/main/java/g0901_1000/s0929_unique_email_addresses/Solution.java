package g0901_1000.s0929_unique_email_addresses;

// #Easy #Array #String #Hash_Table

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
