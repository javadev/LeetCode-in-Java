package g0501_0600.s0514_freedom_trail;

// #Hard #String #Dynamic_Programming #Depth_First_Search #Breadth_First_Search
// #2022_07_25_Time_8_ms_(95.63%)_Space_42.9_MB_(87.34%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    public int findRotateSteps(String ring, String key) {
        List<Integer>[] indexs = new List[26];
        for (int i = 0; i < ring.length(); i++) {
            int num = ring.charAt(i) - 'a';
            if (indexs[num] == null) {
                indexs[num] = new ArrayList<>();
            }
            indexs[num].add(i);
        }
        int[][] dp = new int[101][101];
        return find(ring, 0, key, 0, dp, indexs);
    }

    private int find(String ring, int i, String key, int j, int[][] cache, List<Integer>[] indexs) {
        if (j == key.length()) {
            return 0;
        }
        if (cache[i][j] != 0) {
            return cache[i][j];
        }
        int ans = Integer.MAX_VALUE;
        List<Integer> targets = indexs[key.charAt(j) - 'a'];
        for (int t : targets) {
            int delta = Math.abs(i - t);
            delta = Math.min(delta, Math.abs(ring.length() - delta));
            ans = Math.min(ans, 1 + delta + find(ring, t, key, j + 1, cache, indexs));
        }
        cache[i][j] = ans;
        return ans;
    }
}
