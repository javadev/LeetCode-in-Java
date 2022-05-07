package g1801_1900.s1830_minimum_number_of_operations_to_make_string_sorted;

// #Hard #String #Math #Combinatorics #2022_05_07_Time_125_ms_(94.12%)_Space_42.7_MB_(64.71%)

public class Solution {
    public int makeStringSorted(String s) {
        int n = s.length();
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }

        long[] fact = new long[n + 1];
        fact[0] = 1;
        int mod = 1000000007;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }
        int len = n;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            len--;
            int bound = s.charAt(i) - 'a';
            int first = 0;
            long rev = 1;
            for (int k = 0; k < 26; k++) {
                if (k < bound) {
                    first += count[k];
                }
                rev = (rev * fact[count[k]]) % mod;
            }
            ans =
                    ans % mod
                            + (((first * fact[len]) % mod)
                                            * (modPow(rev, (long) mod - 2, mod))
                                            % mod)
                                    % mod;
            ans = ans % mod;
            count[bound]--;
        }
        return (int) ans;
    }

    private long modPow(long x, long n, int m) {
        long result = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                result = (result * x) % m;
            }
            x = (x * x) % m;
            n = n >> 1;
        }
        return result;
    }
}
