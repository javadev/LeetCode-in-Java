package g2401_2500.s2481_minimum_cuts_to_divide_a_circle;

// #Easy #Math #Geometry #2023_01_25_Time_0_ms_(100.00%)_Space_39.2_MB_(87.50%)

public class Solution {
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }
        return n % 2 > 0 ? n : n / 2;
    }
}
