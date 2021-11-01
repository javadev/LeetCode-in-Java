package s0006_zigzag_conversion;

public class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() <= numRows || numRows == 1) {
            return s;
        }
        char[] letters = new char[s.length()];
        for (int i = 0, k = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < s.length(); j += 2 * numRows - 2) {
                    letters[k++] = s.charAt(j);
                }
                continue;
            }
            letters[k++] = s.charAt(i);
            for (int j = 2 * numRows - 2 - i; j < s.length(); j += 2 * numRows - 2) {
                letters[k++] = s.charAt(j);
                if (j + 2 * i < s.length()) {
                    letters[k++] = s.charAt(j + 2 * i);
                }
            }
        }
        return new String(letters);
    }
}
