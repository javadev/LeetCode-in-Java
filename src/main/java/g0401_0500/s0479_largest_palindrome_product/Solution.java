package g0401_0500.s0479_largest_palindrome_product;

// #Hard #Math #2022_07_20_Time_6_ms_(87.50%)_Space_40.5_MB_(78.57%)

public class Solution {
    public int largestPalindrome(int n) {
        long pow10 = (long) Math.pow(10, n);
        long max = (pow10 - 1) * (pow10 - (long) Math.sqrt(pow10) + 1);
        long left = (max / pow10);
        long t = pow10 / 11;
        t -= ~t & 1;
        for (long i = left; i > 0; i--) {
            for (long j = t, num = gen(i); j >= i / 11; j -= 2) {
                if (num % j == 0) {
                    return (int) (num % 1337);
                }
            }
        }
        return 9;
    }

    private long gen(long x) {
        long r = x;
        while (x > 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        return r;
    }
}
