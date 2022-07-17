package g1301_1400.s1371_find_the_longest_substring_containing_vowels_in_even_counts;

// #Medium #String #Hash_Table #Bit_Manipulation #Prefix_Sum
// #2022_03_21_Time_25_ms_(80.38%)_Space_48.6_MB_(78.47%)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Integer result = null;

    public int findTheLongestSubstring(String s) {
        int[] arr = new int[s.length()];
        int sum = 0;
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                sum =
                        (sum & (1 << 'a' - c)) == 0
                                ? (sum | (1 << 'a' - c))
                                : (sum & ~(1 << 'a' - c));
            }
            arr[i] = sum;
        }
        for (int i = 0; i < s.length(); i++) {
            if (result != null && result > s.length() - i) {
                break;
            }
            for (int j = s.length() - 1; j >= i; j--) {
                int e = arr[j];
                int k = (i - 1) < 0 ? 0 : arr[i - 1];
                int m = e ^ k;
                if (m == 0) {
                    this.result = result == null ? (j - i) + 1 : Math.max(result, (j - i) + 1);
                    break;
                }
            }
        }
        return result == null ? 0 : result;
    }
}
