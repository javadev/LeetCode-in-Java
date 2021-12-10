package g0301_0400.s0342_power_of_four;

// #Easy #Math #Bit_Manipulation #Recursion

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
