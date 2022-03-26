package g1401_1500.s1410_html_entity_parser;

// #Medium #String #Hash_Table #2022_03_26_Time_22_ms_(97.85%)_Space_54.5_MB_(80.64%)

public class Solution {
    public String entityParser(String text) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) != '&') {
                sb.append(text.charAt(i));
            } else {
                if (i + 7 <= text.length() && text.startsWith("&frasl;", i)) {
                    sb.append("/");
                    i += 6;
                } else if (i + 6 <= text.length() && text.startsWith("&quot;", i)) {
                    sb.append("\"");
                    i += 5;
                } else if (i + 6 <= text.length() && text.startsWith("&apos;", i)) {
                    sb.append("'");
                    i += 5;
                } else if (i + 5 <= text.length() && text.startsWith("&amp;", i)) {
                    sb.append("&");
                    i += 4;
                } else if (i + 4 <= text.length() && text.startsWith("&gt;", i)) {
                    sb.append(">");
                    i += 3;
                } else if (i + 4 <= text.length() && text.startsWith("&lt;", i)) {
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
