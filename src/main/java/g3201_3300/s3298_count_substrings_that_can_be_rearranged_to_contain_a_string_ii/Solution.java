package g3201_3300.s3298_count_substrings_that_can_be_rearranged_to_contain_a_string_ii;

// #Hard #String #Hash_Table #Sliding_Window #2024_09_24_Time_31_ms_(100.00%)_Space_56.1_MB_(68.76%)

public class Solution {
    public long validSubstringCount(String word1, String word2) {
        char[] ar = word1.toCharArray();
        int n = ar.length;
        char[] temp = word2.toCharArray();
        int[] f = new int[26];
        for (char i : temp) {
            f[i - 97]++;
        }
        long ans = 0;
        int needed = temp.length;
        int beg = 0;
        int end = 0;
        while (end < n) {
            if (f[ar[end] - 97]-- > 0) {
                needed--;
            }
            while (needed == 0) {
                // All substrings from [beg, i], where end <= i < n are valid
                ans += n - end;
                // Shrink
                if (f[ar[beg++] - 97]++ == 0) {
                    needed++;
                }
            }
            end++;
        }
        return ans;
    }
}
