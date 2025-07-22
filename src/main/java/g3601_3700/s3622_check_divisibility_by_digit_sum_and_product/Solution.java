package g3601_3700.s3622_check_divisibility_by_digit_sum_and_product;

// #Easy #Math #Weekly_Contest_459 #2025_07_22_Time_0_ms_(100.00%)_Space_40.91_MB_(44.64%)

public class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int sum = 0;
        int mul = 1;
        while (x != 0) {
            sum += x % 10;
            mul *= x % 10;
            x = x / 10;
        }
        return n % (sum + mul) == 0;
    }
}
