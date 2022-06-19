package g2301_2400.s2309_greatest_english_letter_in_upper_and_lower_case;

// #Easy #Array #2022_06_19_Time_4_ms_(75.00%)_Space_42.9_MB_(50.00%)

public class Solution {
    public String greatestLetter(String s) {
        boolean[] lowers = new boolean[26];
        boolean[] uppers = new boolean[26];
        for (char c : s.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                lowers[c - 'a'] = true;
            } else {
                uppers[c - 'A'] = true;
            }
        }
        char res = ' ';
        for (int i = 0; i < 26; ++i) {
            if (lowers[i] && uppers[i]) {
                res = (char) ('A' + i);
            }
        }
        if (res != ' ') {
            return "" + res;
        } else {
            return "";
        }
    }
}
