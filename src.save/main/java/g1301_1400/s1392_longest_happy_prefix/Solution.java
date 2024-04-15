package g1301_1400.s1392_longest_happy_prefix;

// #Hard #String #Hash_Function #String_Matching #Rolling_Hash
// #2022_03_17_Time_39_ms_(28.37%)_Space_42.6_MB_(94.23%)

public class Solution {
    public String longestPrefix(String s) {
        int times = 2;
        long prefixHash = 0;
        long suffixHash = 0;
        long multiplier = 1;
        long len = 0;
        // use some large prime as a modulo to avoid overflow errors, e.g. 10 ^ 9 + 7.
        long mod = 1000000007;
        for (int i = 0; i < s.length() - 1; i++) {
            prefixHash = (prefixHash * times + s.charAt(i)) % mod;
            suffixHash = (multiplier * s.charAt(s.length() - i - 1) + suffixHash) % mod;
            if (prefixHash == suffixHash) {
                len = (long) i + 1;
            }
            multiplier = multiplier * times % mod;
        }
        return s.substring(0, (int) len);
    }
}
