package g1401_1500.s1410_html_entity_parser;

// #Medium #String #Hash_Table #2022_03_26_Time_15_ms_(98.92%)_Space_42.6_MB_(100.00%)

public class Solution {
    public String entityParser(String text) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) != '&') {
                sb.append(text.charAt(i));
            } else {
                if (text.startsWith("&frasl;", i)) {
                    sb.append("/");
                    i += 6;
                } else if (text.startsWith("&quot;", i)) {
                    sb.append("\"");
                    i += 5;
                } else if (text.startsWith("&apos;", i)) {
                    sb.append("'");
                    i += 5;
                } else if (text.startsWith("&amp;", i)) {
                    sb.append("&");
                    i += 4;
                } else if (text.startsWith("&gt;", i)) {
                    sb.append(">");
                    i += 3;
                } else if (text.startsWith("&lt;", i)) {
                    sb.append("<");
                    i += 3;
                } else {
                    sb.append(text.charAt(i));
                }
            }
            i++;
        }
        return sb.toString();
    }
}
