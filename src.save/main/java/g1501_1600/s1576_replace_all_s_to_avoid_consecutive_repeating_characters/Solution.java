package g1501_1600.s1576_replace_all_s_to_avoid_consecutive_repeating_characters;

// #Easy #String #2022_04_11_Time_2_ms_(82.74%)_Space_43.1_MB_(58.74%)

public class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '?') {
                char replaceChar = 'a';
                char leftChar = i == 0 ? s.charAt(i) : sb.charAt(i - 1);
                char rightChar = s.charAt(Math.min(i + 1, len - 1));
                while (replaceChar == leftChar || replaceChar == rightChar) {
                    replaceChar += 1;
                }
                sb.append(replaceChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
