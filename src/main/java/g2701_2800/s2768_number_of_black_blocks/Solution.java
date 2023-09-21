package g2701_2800.s2768_number_of_black_blocks;

// #Medium #Array #Hash_Table #Enumeration #2023_09_21_Time_94_ms_(98.91%)_Space_55.3_MB_(48.37%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long[] countBlackBlocks(int m, int n, int[][] coordinates) {
        long[] ans = new long[5];
        Map<Integer, Integer> count = new HashMap<>();
        for (int[] coordinate : coordinates) {
            int x = coordinate[0];
            int y = coordinate[1];
            for (int i = x; i < x + 2; i++) {
                for (int j = y; j < y + 2; j++) {
                    if (i - 1 >= 0 && i < m && j - 1 >= 0 && j < n) {
                        count.merge(i * n + j, 1, (a, b) -> a + b);
                    }
                }
            }
        }
        for (int freq : count.values()) {
            ans[freq]++;
        }
        ans[0] = (m - 1L) * (n - 1) - Arrays.stream(ans).sum();
        return ans;
    }
}
