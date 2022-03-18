package g0401_0500.s0455_assign_cookies;

// #Easy #Array #Sorting #Greedy #2022_03_18_Time_11_ms_(42.95%)_Space_54.7_MB_(6.90%)

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                result++;
                i++;
            }
            j++;
        }
        return result;
    }
}
