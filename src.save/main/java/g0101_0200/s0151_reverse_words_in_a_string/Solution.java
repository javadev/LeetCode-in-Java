package g0101_0200.s0151_reverse_words_in_a_string;

// #Medium #String #Two_Pointers #2022_02_23_Time_3_ms_(96.37%)_Space_43.4_MB_(35.43%)

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
            sb.append(s, start + 1, i + 1);
            i = start - 1;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
