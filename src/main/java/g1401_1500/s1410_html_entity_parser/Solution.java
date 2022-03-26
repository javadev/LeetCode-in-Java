package g1401_1500.s1410_html_entity_parser;

// #Medium #String #Hash_Table #2022_03_26_Time_41_ms_(73.12%)_Space_72.8_MB_(20.43%)

public class Solution {
    public String entityParser(String text) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) != '&') {
                sb.append(text.charAt(i));
            } else {
                if (i + 7 <= text.length() && text.substring(i, i + 7).equals("&frasl;")) {
                    sb.append("/");
                    i += 6;
                } else if (i + 6 <= text.length() && text.substring(i, i + 6).equals("&quot;")) {
                    sb.append("\"");
                    i += 5;
                } else if (i + 6 <= text.length() && text.substring(i, i + 6).equals("&apos;")) {
                    sb.append("'");
                    i += 5;
                } else if (i + 5 <= text.length() && text.substring(i, i + 5).equals("&amp;")) {
                    sb.append("&");
                    i += 4;
                } else if (i + 4 <= text.length() && text.substring(i, i + 4).equals("&gt;")) {
                    sb.append(">");
                    i += 3;
                } else if (i + 4 <= text.length() && text.substring(i, i + 4).equals("&lt;")) {
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
