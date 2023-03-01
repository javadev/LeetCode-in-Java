package g0001_0100.s0029_divide_two_integers;

// #Medium #Top_Interview_Questions #Math #Bit_Manipulation #Udemy_Bit_Manipulation
// #2022_06_14_Time_1_ms_(99.96%)_Space_39.6_MB_(87.25%)

public class Solution {
    public int divide(int dividend, int divisor) {
        boolean isNegative = dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0;
        long ans = 0;
        long divide = Math.abs((long) dividend);
        long divisorAbs = Math.abs((long) divisor);
        while (divide >= divisorAbs) {
            long temp = divisorAbs;
            long cnt = 1;
            while (divide >= temp) {
                divide -= temp;
                ans += cnt;
                cnt <<= 1;
                temp <<= 1;
            }
        }
        if (isNegative) {
            ans = -ans;
        }
        int intMin = -(1 << 31);
        int intMax = (1 << 31) - 1;
        if (ans < intMin || ans > intMax) {
            ans = intMax;
        }
        return (int) ans;
    }
}
