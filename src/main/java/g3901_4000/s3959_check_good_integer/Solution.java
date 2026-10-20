package g3901_4000.s3959_check_good_integer;

// #Easy #Math #Simulation #Mid_Level #Weekly_Contest_506
// #2026_10_20_Time_1_ms_(92.77%)_Space_42.13_MB_(93.32%)

public class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit - digit;
            n /= 10;
        }
        return sum >= 50;
    }
}
