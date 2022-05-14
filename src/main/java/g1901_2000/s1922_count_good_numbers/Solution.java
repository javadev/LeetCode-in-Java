package g1901_2000.s1922_count_good_numbers;

// #Medium #Math #Recursion #2022_05_14_Time_1_ms_(87.11%)_Space_40.6_MB_(68.56%)

public class Solution {
    public int countGoodNumbers(long n) {
        long mod = 1000000007L;
        long result = n % 2 == 0 ? 1L : 5L;

        long base = 20L;
        long time = n / 2L;
        while (time > 0) {
            if (time % 2L > 0) {
                result *= base;
                result %= mod;
            }
            time /= 2L;
            base = base * base % mod;
        }
        return (int) result;
    }
}
