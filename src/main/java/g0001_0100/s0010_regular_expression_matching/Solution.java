package g0001_0100.s0010_regular_expression_matching;

public class Solution {

    Boolean[][] cache;

    public boolean isMatch(String s, String p) {
        cache = new Boolean[s.length() + 1][p.length() + 1];
        return isMatch(s, p, 0, 0);
    }

    public boolean isMatch(String s, String p, int i, int j) {
        if (j == p.length()) {
            return i == s.length();
        }

        boolean result;

        if (cache[i][j] != null) {
            return cache[i][j];
        }

        boolean firstMatch = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        if ((j + 1) < p.length() && p.charAt(j + 1) == '*') {
            result = (firstMatch && isMatch(s, p, i + 1, j)) || isMatch(s, p, i, j + 2);
        } else {
            result = firstMatch && isMatch(s, p, i + 1, j + 1);
        }
        cache[i][j] = result;
        return result;
    }
}
