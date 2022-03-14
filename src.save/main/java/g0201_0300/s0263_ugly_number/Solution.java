package g0201_0300.s0263_ugly_number;

// #Easy #Math #2022_03_14_Time_1_ms_(95.93%)_Space_41.7_MB_(19.40%)

public class Solution {
    public boolean isUgly(int n) {
        if (n == 1) {
            return true;
        } else if (n <= 0) {
            return false;
        }
        int[] factors = new int[] {2, 3, 5};
        for (int factor : factors) {
            while (n > 1 && n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
