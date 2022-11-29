package g0101_0200.s0151_reverse_words_in_a_string;

// #Medium #String #Two_Pointers #Udemy_Strings
// #2022_06_25_Time_2_ms_(99.94%)_Space_42.4_MB_(88.57%)

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
