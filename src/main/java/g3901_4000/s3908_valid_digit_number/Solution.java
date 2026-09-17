package g3901_4000.s3908_valid_digit_number;

// #Easy #Math #Mid_Level #Biweekly_Contest_181
// #2026_09_17_Time_1_ms_(98.66%)_Space_42.77_MB_(28.00%)

public class Solution {
    public boolean validDigit(int n, int x) {
        boolean value = false;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            if (rem == x) {
                value = true;
            }
            if (n == 0 && rem == x) {
                value = false;
            }
        }
        return value;
    }
}
