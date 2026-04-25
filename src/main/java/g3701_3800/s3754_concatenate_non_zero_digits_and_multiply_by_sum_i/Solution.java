package g3701_3800.s3754_concatenate_non_zero_digits_and_multiply_by_sum_i;

// #Easy #Math #Mid_Level #Weekly_Contest_477
// #2026_04_25_Time_1_ms_(100.00%)_Space_42.50_MB_(73.85%)

public class Solution {
    public long sumAndMultiply(int n) {
        int newNum = 0;
        int y = Math.abs(n);
        while (y > 0) {
            int rem = y % 10;
            if (rem != 0) {
                newNum = newNum * 10 + rem;
            }
            y /= 10;
        }
        int temp = 0;
        while (newNum > 0) {
            int rem = newNum % 10;
            temp = temp * 10 + rem;
            newNum /= 10;
        }
        int x = temp;
        long sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        return sum * x;
    }
}
