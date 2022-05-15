package g0201_0300.s0258_add_digits;

// #Easy #Math #Simulation #Number_Theory #Acceptance_62.5%
// #2022_03_14_Time_1_ms_(95.33%)_Space_41.9_MB_(13.57%)

public class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }
}
