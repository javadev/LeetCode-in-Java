package g2201_2300.s2262_total_appeal_of_a_string;

// #Hard #String #Hash_Table #Dynamic_Programming
// #2022_06_15_Time_6_ms_(97.92%)_Space_48.3_MB_(80.72%)

import java.util.Arrays;

public class Solution {
    public long appealSum(String s) {
        int len = s.length();
        int[] lastPos = new int[26];
        Arrays.fill(lastPos, -1);
        long res = 0;
        for (int i = 0; i < len; i++) {
            int idx = s.charAt(i) - 'a';
            res += (i - lastPos[idx]) * (len - i);
            lastPos[idx] = i;
        }
        return res;
    }
}
