package g2501_2600.s2564_substring_xor_queries;

// #Medium #Array #String #Hash_Table #Bit_Manipulation
// #2023_08_21_Time_26_ms_(95.83%)_Space_84.1_MB_(80.56%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[][] substringXorQueries(String s, int[][] queries) {
        int[][] ans = new int[queries.length][2];
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                map.putIfAbsent(0, new int[] {i, i});
                continue;
            }
            int value = 0;
            for (int j = i; j <= Math.min(i + 30, s.length() - 1); j++) {
                value = (value << 1) + (s.charAt(j) - '0');
                map.putIfAbsent(value, new int[] {i, j});
            }
        }
        int i = 0;
        for (int[] q : queries) {
            ans[i++] = map.getOrDefault(q[0] ^ q[1], new int[] {-1, -1});
        }
        return ans;
    }
}
