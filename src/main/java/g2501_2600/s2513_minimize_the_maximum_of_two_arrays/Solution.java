package g2501_2600.s2513_minimize_the_maximum_of_two_arrays;

// #Medium #Math #Binary_Search #Number_Theory
// #2023_03_21_Time_0_ms_(100.00%)_Space_39.4_MB_(35.80%)

public class Solution {
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        long lo = 1;
        long hi = (int) 10e10;
        if (divisor2 == 0) {
            divisor2 = 1;
        }
        long lcm = ((long) divisor1 * (long) divisor2) / gcd(divisor1, divisor2);
        while (lo < hi) {
            long mi = lo + (hi - lo) / 2;
            int cnt1 = (int) (mi - mi / divisor1);
            int cnt2 = (int) (mi - mi / divisor2);
            int cntAll = (int) (mi - mi / lcm);
            if (cnt1 < uniqueCnt1 || cnt2 < uniqueCnt2 || cntAll < uniqueCnt1 + uniqueCnt2) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }
        return (int) lo;
    }
}
