package g0201_0300.s0231_power_of_two;

// #Easy #Math #Bit_Manipulation #Recursion #Acceptance_45.0% #Algorithm_I_Day_13_Bit_Manipulation
// #2022_03_14_Time_1_ms_(95.76%)_Space_41.4_MB_(36.37%)

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (true) {
            if (n == 1) {
                return true;
            }
            if (n % 2 == 1) {
                return false;
            }
            n /= 2;
        }
    }
}
