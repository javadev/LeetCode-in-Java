package g1401_1500.s1417_reformat_the_string;

// #Easy #String #2022_07_17_Time_13_ms_(47.85%)_Space_47.5_MB_(46.32%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String reformat(String s) {
        List<Character> chars = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                digits.add(c);
            } else {
                chars.add(c);
            }
        }
        if (Math.abs(digits.size() - chars.size()) > 1) {
            return "";
        }
        boolean isDigit = digits.size() > chars.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isDigit) {
                sb.append(digits.remove(0));
            } else {
                sb.append(chars.remove(0));
            }
            isDigit = !isDigit;
        }
        return sb.toString();
    }
}
