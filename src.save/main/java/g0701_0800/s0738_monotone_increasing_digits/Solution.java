package g0701_0800.s0738_monotone_increasing_digits;

// #Medium #Math #Greedy #2022_03_25_Time_0_ms_(100.00%)_Space_39.5_MB_(82.97%)

public class Solution {
    public int monotoneIncreasingDigits(int n) {
        for (int i = 10; n / i > 0; i *= 10) {
            int digit = (n / i) % 10;
            int endnum = n % i;
            int firstendnum = endnum * 10 / i;
            if (digit > firstendnum) {
                n -= endnum + 1;
            }
        }
        return n;
    }
}
