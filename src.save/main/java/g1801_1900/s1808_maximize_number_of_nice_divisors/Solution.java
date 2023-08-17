package g1801_1900.s1808_maximize_number_of_nice_divisors;

// #Hard #Math #Recursion #2022_05_03_Time_1_ms_(80.77%)_Space_41_MB_(42.31%)

public class Solution {
    private long modPow(long b, int e, int m) {
        if (m == 1) {
            return 0;
        }
        if (e == 0 || b == 1) {
            return 1;
        }
        b %= m;
        long r = 1;
        while (e > 0) {
            if ((e & 1) == 1) {
                r = r * b % m;
            }
            e = e >> 1;
            b = b * b % m;
        }
        return r;
    }

    public int maxNiceDivisors(int pf) {
        int mod = 1000000007;
        int[] st = new int[] {0, 1, 2, 3, 4, 6};
        return pf < 5 ? pf : (int) (modPow(3, pf / 3 - 1, mod) * st[3 + pf % 3] % mod);
    }
}
