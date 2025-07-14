package g3601_3700.s3614_process_string_with_special_operations_ii;

// #Hard #2025_07_14_Time_54_ms_(100.00%)_Space_45.64_MB_(100.00%)

public class Solution {
    public char processStr(String s, long k) {
        long len = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                len++;
            } else if (c == '*' && len > 0) {
                len--;
            } else if (c == '#') {
                len *= 2;
            }
        }
        if (k >= len) {
            return '.';
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                if (k == len - 1) {
                    return c;
                }
                len--;
            } else if (c == '*') {
                len++;
            } else if (c == '#') {
                len /= 2;
                if (k >= len) {
                    k -= len;
                }
            } else if (c == '%') {
                k = len - 1 - k;
            }
        }
        return '.';
    }
}
