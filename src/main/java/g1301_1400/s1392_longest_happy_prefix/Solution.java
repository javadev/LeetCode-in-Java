package g1301_1400.s1392_longest_happy_prefix;

// #Hard #String #Hash_Function #String_Matching #Rolling_Hash
// #2025_04_23_Time_5_ms_(100.00%)_Space_45.92_MB_(23.63%)

public class Solution {
    public String longestPrefix(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int[] a = new int[n];
        int max = 0;
        int i = 1;
        while (i < n) {
            if (c[max] == c[i]) {
                max++;
                a[i] = max;
                i++;
            } else {
                if (max > 0) {
                    max = a[max - 1];
                } else {
                    a[i] = 0;
                    i++;
                }
            }
        }
        return s.substring(0, a[n - 1]);
    }
}
