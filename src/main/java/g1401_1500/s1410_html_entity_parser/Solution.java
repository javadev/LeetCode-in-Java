package g1401_1500.s1410_html_entity_parser;

// #Medium #String #Hash_Table #2022_03_27_Time_32_ms_(92.47%)_Space_57.8_MB_(69.89%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String entityParser(String text) {
        Map<String, String> map = new HashMap<>();
        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
        int n = text.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            if (c == '&') {
                int index = text.indexOf(";", i);
                String pattern = index >= 0 ? text.substring(i, index + 1) : text;
                if (map.containsKey(pattern)) {
                    sb.append(map.get(pattern));
                    i += pattern.length() - 1;
                    continue;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
