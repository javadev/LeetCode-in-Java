package g0601_0700.s0686_repeated_string_match;

// #Medium #String #String_Matching

public class Solution {
    public int repeatedStringMatch(String a, String b) {
        char[] existsChar = new char[127];
        for (char chA : a.toCharArray()) {
            existsChar[chA] = 1;
        }
        for (char chB : b.toCharArray()) {
            if (existsChar[chB] < 1) {
                return -1;
            }
        }
        if (a == null || b == null) {
            return -1;
        }

        int lenB = b.length() - 1;
        StringBuffer sb = new StringBuffer(a);
        int lenSb_A = sb.length() - 1;
        int repeatCount = 1;
        while (lenSb_A < lenB) {
            sb.append(a);
            repeatCount++;
            lenSb_A = sb.length() - 1;
        }
        if (!isFound(sb, b)) {
            sb.append(a);
            repeatCount++;
            return !isFound(sb, b) ? -1 : repeatCount;
        }
        return repeatCount;
    }

    private boolean isFound(StringBuffer a, String b) {
        for (int i = 0; i < a.length(); i++) {
            int k = i;
            int m = 0;
            while (k < a.length() && m < b.length()) {
                if (a.charAt(k) != b.charAt(m)) {
                    break;
                } else {
                    k++;
                    m++;
                }
            }
            if (m == b.length()) {
                return true;
            }
        }
        return false;
    }
}
