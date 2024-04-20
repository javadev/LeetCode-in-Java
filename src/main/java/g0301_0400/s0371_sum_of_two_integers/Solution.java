package g0301_0400.s0371_sum_of_two_integers;

// #Medium #Math #Bit_Manipulation #Udemy_Bit_Manipulation
// #2022_07_12_Time_0_ms_(100.00%)_Space_40.3_MB_(77.27%)

public class Solution {
    public int getSum(int a, int b) {
        int ans = 0;
        int memo = 0;
        int exp = 0;
        int count = 0;
        while (count < 32) {
            int val1 = a & 1;
            int val2 = b & 1;
            int val = sum(val1, val2, memo);
            memo = val >> 1;
            val = val & 1;
            a = a >> 1;
            b = b >> 1;
            ans = ans | (val << exp);
            exp = plusOne(exp);
            count = plusOne(count);
        }
        return ans;
    }

    private int sum(int val1, int val2, int val3) {
        int count = 0;
        if (val1 == 1) {
            count = plusOne(count);
        }
        if (val2 == 1) {
            count = plusOne(count);
        }
        if (val3 == 1) {
            count = plusOne(count);
        }
        return count;
    }

    private int plusOne(int val) {
        return (-(~val));
    }
}
