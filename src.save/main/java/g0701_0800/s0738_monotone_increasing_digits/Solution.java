package g0701_0800.s0738_monotone_increasing_digits;

// #Medium #Math #Greedy

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
        return (n);
    }
}
