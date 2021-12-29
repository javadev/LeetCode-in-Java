package g0401_0500.s0479_largest_palindrome_product;

// #Hard #Math

public class Solution {
    public int largestPalindrome(int n) {
        long pow_10 = (long) Math.pow(10, n);
        long max = (pow_10 - 1) * (pow_10 - (long) Math.sqrt(pow_10) + 1);
        long left = (max / pow_10);
        long t = pow_10 / 11;
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
        for (; x > 0; r = r * 10 + x % 10, x /= 10) ;
        return r;
    }
}
