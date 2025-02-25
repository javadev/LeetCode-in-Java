package g3401_3500.s3461_check_if_digits_are_equal_in_string_after_operations_i;

// #Easy #String #Math #Simulation #Number_Theory #Combinatorics
// #2025_02_25_Time_2_ms_(96.71%)_Space_42.26_MB_(97.03%)

public class Solution {
    public boolean hasSameDigits(String s) {
        char[] ch = s.toCharArray();
        int k = ch.length - 1;
        while (k != 1) {
            for (int i = 0; i < k; i++) {
                int a = ch[i] - 48;
                int b = ch[i + 1] - 48;
                int d = (a + b) % 10;
                char c = (char) (d + '0');
                ch[i] = c;
            }
            k--;
        }
        return ch[0] == ch[1];
    }
}
