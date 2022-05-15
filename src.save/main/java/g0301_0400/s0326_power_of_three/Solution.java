package g0301_0400.s0326_power_of_three;

// #Easy #Top_Interview_Questions #Math #Recursion #Acceptance_43.5%
// #2022_03_15_Time_18_ms_(79.91%)_Space_47.4_MB_(35.85%)

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
