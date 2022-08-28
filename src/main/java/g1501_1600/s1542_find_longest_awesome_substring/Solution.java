package g1501_1600.s1542_find_longest_awesome_substring;

// #Hard #String #Hash_Table #Bit_Manipulation
// #2022_04_11_Time_12_ms_(84.16%)_Space_47.2_MB_(57.43%)

import java.util.Arrays;

public class Solution {
    public int longestAwesome(String s) {
        int n = s.length();
        int[] idx = new int[(int) Math.pow(2, 10)];
        Arrays.fill(idx, Integer.MAX_VALUE);
        idx[0] = -1;
        int mask = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            mask ^= 1 << (s.charAt(i) - '0');
            ans = Math.max(ans, i - idx[mask]);
            for (int j = 0; j < 10; j++) {
                ans = Math.max(ans, i - idx[mask ^ (1 << j)]);
            }
            idx[mask] = Math.min(idx[mask], i);
        }
        return ans;
    }
}
