package g0001_0100.s0050_powx_n;

// #Medium #Top_Interview_Questions #Math #Recursion #Udemy_Integers #Top_Interview_150_Math
// #2025_03_04_Time_0_ms_(100.00%)_Space_41.72_MB_(93.18%)

public class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        double res = 1;
        if (n < 0) {
            nn *= -1;
        }
        while (nn > 0) {
            if (nn % 2 == 1) {
                nn--;
                res *= x;
            } else {
                x *= x;
                nn /= 2;
            }
        }
        if (n < 0) {
            return 1.0 / res;
        }
        return res;
    }
}
