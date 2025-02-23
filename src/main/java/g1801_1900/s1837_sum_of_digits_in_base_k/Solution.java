package g1801_1900.s1837_sum_of_digits_in_base_k;

// #Easy #Math #2025_02_23_Time_0_ms_(100.00%)_Space_40.80_MB_(21.87%)

public class Solution {
    public int sumBase(int n, int k) {
        int a = 0;
        int sum = 0;
        int b = 0;
        while (n != 0) {
            a = n % k;
            b = n / k;
            sum += a;
            n = b;
        }
        return sum;
    }
}
