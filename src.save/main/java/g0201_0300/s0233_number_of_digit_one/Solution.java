package g0201_0300.s0233_number_of_digit_one;

// #Hard #Dynamic_Programming #Math #Recursion
// #2022_07_04_Time_0_ms_(100.00%)_Space_41.2_MB_(25.50%)

@SuppressWarnings("java:S127")
public class Solution {
    public int countDigitOne(int n) {
        int ans = 0;
        // count total number of 1s appearing in every digit, starting from the last digit
        for (int k = n, cum = 0, curr10 = 1; k > 0; curr10 *= 10) {
            int rem = k % 10;
            int q = k / 10;
            if (rem == 0) {
                ans += q * curr10;
            } else if (rem == 1) {
                ans += q * curr10 + cum + 1;
            } else {
                ans += (q + 1) * curr10;
            }
            k = q;
            // if loop is at 3rd last digit and n = 54321, cum is now = 321
            cum += rem * curr10;
        }
        return ans;
    }
}
