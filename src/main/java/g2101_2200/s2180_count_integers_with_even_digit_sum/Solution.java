package g2101_2200.s2180_count_integers_with_even_digit_sum;

// #Easy #Math #Simulation #2022_06_08_Time_0_ms_(100.00%)_Space_41.1_MB_(42.90%)

public class Solution {
    public int countEven(int n) {
        if (n % 2 == 1) {
            return n / 2;
        } else {
            int ans = 0;
            int num = n;
            while (num != 0) {
                ans += num % 10;
                num /= 10;
            }
            if (ans % 2 == 0) {
                return n / 2;
            } else {
                return n / 2 - 1;
            }
        }
    }
}
