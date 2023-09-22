package g2701_2800.s2734_lexicographically_smallest_string_after_substring_operation;

// #Medium #String #Greedy #2023_09_22_Time_12_ms_(86.26%)_Space_48.4_MB_(70.88%)

public class Solution {
    public String smallestString(String s) {
        int i = 0, n = s.length();
        char[] A = s.toCharArray();
        while (i < n && A[i] == 'a') {
            i++;
            if (i == n) A[n - 1] = 'z';
        }
        while (i < n && A[i] != 'a') {
            --A[i++];
        }
        return String.valueOf(A);
    }
}
