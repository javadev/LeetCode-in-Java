package g0301_0400.s0326_power_of_three;

// #Easy #Math #Recursion #2022_07_09_Time_18_ms_(85.35%)_Space_47.9_MB_(14.68%)

public class Solution {
    // regular method that has a loop
    public boolean isPowerOfThree(int n) {
        if (n < 3 && n != 1) {
            return false;
        }
        while (n != 1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
