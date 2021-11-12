package g0101_0200.s0151_reverse_words_in_a_string;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
                continue;
            }
            int start = s.lastIndexOf(' ', i);
            sb.append(' ');
            sb.append(s.substring(start + 1, i + 1));
            i = start - 1;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
