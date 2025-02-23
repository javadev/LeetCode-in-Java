package g3401_3500.s3461_check_if_digits_are_equal_in_string_after_operations_i;

// #Easy #2025_02_23_Time_23_ms_(100.00%)_Space_45.51_MB_(100.00%)

public class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        while (n > 2) {
            StringBuilder nstr = new StringBuilder();
            for (int i = 1; i < n; i++) {
                int next = ((s.charAt(i) - '0') + (s.charAt(i - 1) - '0')) % 10;
                nstr.append(next);
            }
            n--;
            s = nstr.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}
