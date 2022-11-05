package g2301_2400.s2306_naming_a_company;

// #Hard #Array #String #Hash_Table #Bit_Manipulation #Enumeration
// #2022_06_15_Time_486_ms_(74.14%)_Space_83.3_MB_(58.98%)

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    private long count(Map<Character, Set<String>> map, char a, char b) {
        if (!map.containsKey(a) || !map.containsKey(b)) {
            return 0;
        }
        long common = 0;
        Set<String> first = map.get(a);
        Set<String> second = map.get(b);
        for (String c : first) {
            if (second.contains(c)) {
                common++;
            }
        }
        long uniqueA = first.size() - common;
        long uniqueB = second.size() - common;
        return uniqueA * uniqueB * 2L;
    }

    public long distinctNames(String[] ideas) {
        long ans = 0;
        Map<Character, Set<String>> map = new HashMap<>();
        for (String idea : ideas) {
            char startChar = idea.charAt(0);
            Set<String> values = map.getOrDefault(startChar, new HashSet<>());
            values.add(idea.substring(1));
            map.put(startChar, values);
        }
        for (int i = 0; i <= 26; i++) {
            for (int j = i + 1; j <= 26; j++) {
                long unique = count(map, (char) (i + 'a'), (char) (j + 'a'));
                ans += unique;
            }
        }
        return ans;
    }
}
