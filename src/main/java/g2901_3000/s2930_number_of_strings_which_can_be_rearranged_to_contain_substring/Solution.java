package g2901_3000.s2930_number_of_strings_which_can_be_rearranged_to_contain_substring;

// #Medium #Dynamic_Programming #Math #Combinatorics
// #2024_01_02_Time_1_ms_(80.56%)_Space_40.8_MB_(66.67%)

public class Solution {
    private long pow(long x, long n, long mod) {
        long result = 1;
        long p = x % mod;
        while (n != 0) {
            if ((n & 1) != 0) {
                result = (result * p) % mod;
            }
            p = (p * p) % mod;
            n >>= 1;
        }
        return result;
    }

    public int stringCount(int n) {
        long mod = (int) 1e9 + 7L;
        return (int)
                (((+pow(26, n, mod)
                                                - (n + 75) * pow(25, n - 1L, mod)
                                                + (2 * n + 72) * pow(24, n - 1L, mod)
                                                - (n + 23) * pow(23, n - 1L, mod))
                                        % mod
                                + mod)
                        % mod);
    }
}
