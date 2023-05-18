package g1801_1900.s1844_replace_all_digits_with_characters;

// #Easy #String #2022_05_07_Time_1_ms_(70.12%)_Space_42.3_MB_(43.95%)

public class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            } else {
                sb.append((char) (sb.charAt(sb.length() - 1) + Character.getNumericValue(c)));
            }
        }
        return sb.toString();
    }
}
