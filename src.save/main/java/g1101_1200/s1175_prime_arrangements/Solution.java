package g1101_1200.s1175_prime_arrangements;

// #Easy #Math #2022_06_13_Time_0_ms_(100.00%)_Space_40.2_MB_(64.71%)

public class Solution {
    public int numPrimeArrangements(int n) {
        int[] a = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
            89, 97
        };
        int c = 0;
        while (c < 25 && n >= a[c]) {
            c++;
        }
        int m = 1000000007;
        long res = 1L;
        while ((n - c) > 0) {
            res *= (n - c);
            res %= m;
            n--;
        }
        while (c > 0) {
            res *= c;
            res %= m;
            c--;
        }
        return (int) res;
    }
}
