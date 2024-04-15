package g2701_2800.s2734_lexicographically_smallest_string_after_substring_operation;

// #Medium #String #Greedy #2023_09_22_Time_12_ms_(86.26%)_Space_48.4_MB_(70.88%)

public class Solution {
    public String smallestString(String s) {
        int i = 0;
        int n = s.length();
        char[] a = s.toCharArray();
        while (i < n && a[i] == 'a') {
            i++;
            if (i == n) {
                a[n - 1] = 'z';
            }
        }
        while (i < n && a[i] != 'a') {
            --a[i++];
        }
        return String.valueOf(a);
    }
}
