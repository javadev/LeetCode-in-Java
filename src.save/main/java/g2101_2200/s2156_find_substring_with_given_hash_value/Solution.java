package g2101_2200.s2156_find_substring_with_given_hash_value;

// #Hard #String #Sliding_Window #Hash_Function #Rolling_Hash
// #2022_06_08_Time_37_ms_(36.57%)_Space_47.8_MB_(55.97%)

public class Solution {
    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        long mul1 = 1;
        int times = k - 1;
        while (times-- > 0) {
            mul1 = mul1 * power % modulo;
        }
        int index = -1;
        long hash = 0;
        int end = s.length() - 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = s.charAt(i) - 96;
            hash = (hash * power % modulo + val) % modulo;
            if (end - i + 1 == k) {
                if (hash == hashValue) {
                    index = i;
                }
                hash = (hash - (s.charAt(end) - 96) * mul1 % modulo + modulo) % modulo;
                end--;
            }
        }
        return s.substring(index, index + k);
    }
}
