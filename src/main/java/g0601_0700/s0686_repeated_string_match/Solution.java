package g0601_0700.s0686_repeated_string_match;

// #Medium #String #String_Matching #2022_03_22_Time_7_ms_(94.56%)_Space_42.3_MB_(71.11%)

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

        int lenB = b.length() - 1;
        StringBuilder sb = new StringBuilder(a);
        int lenSbA = sb.length() - 1;
        int repeatCount = 1;
        while (lenSbA < lenB) {
            sb.append(a);
            repeatCount++;
            lenSbA = sb.length() - 1;
        }
        if (!isFound(sb, b)) {
            sb.append(a);
            repeatCount++;
            return !isFound(sb, b) ? -1 : repeatCount;
        }
        return repeatCount;
    }

    private boolean isFound(StringBuilder a, String b) {
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
