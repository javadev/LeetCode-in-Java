package g4001_4100.s4021_minimum_operations_to_make_a_rotated_palindrome_i;

// #Medium #String #Math #Enumeration #Staff #Biweekly_Contest_189
// #2026_11_19_Time_40_ms_(98.85%)_Space_46.02_MB_(33.33%)

public class Solution {
    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();
        int[][] dist = new int[26][26];
        for (int a = 0; a < 26; ++a) {
            for (int b = 0; b < 26; ++b) {
                int diff = Math.abs(a - b);
                dist[a][b] = Math.min(diff, 26 - diff);
            }
        }
        int[] vals = new int[n];
        for (int i = 0; i < n; ++i) {
            vals[i] = chars[i] - 97;
        }
        int mid = n >> 1;
        int min = 0;
        for (int i = 0; i < mid; ++i) {
            min += dist[vals[i]][vals[n - 1 - i]];
        }
        int[] diff = new int[n << 1];
        for (int i = 0; i < 2 * n; ++i) {
            diff[i] = vals[i % n];
        }
        for (int shift = 1; shift < n >> (1 - (n & 1)) && shift < min; ++shift) {
            int curr = shift;
            for (int i = 0; i < mid; ++i) {
                curr += dist[diff[shift + i]][diff[shift + n - 1 - i]];
                if (curr >= min) {
                    break;
                }
            }
            min = Math.min(min, curr);
        }
        return min;
    }
}
