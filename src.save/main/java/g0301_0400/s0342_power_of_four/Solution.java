package g0301_0400.s0342_power_of_four;

// #Easy #Math #Bit_Manipulation #Recursion #2022_03_15_Time_1_ms_(91.73%)_Space_41.4_MB_(30.80%)

public class Solution {
    public boolean isPowerOfFour(int n) {
        while (n >= 4) {
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4;
        }

        return n == 1;
    }
}
