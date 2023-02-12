package g2401_2500.s2492_minimum_score_of_a_path_between_two_cities;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2023_01_27_Time_13_ms_(92.82%)_Space_101.5_MB_(78.71%)

import java.util.Arrays;

public class Solution {
    private int[] dsu;

    public int minScore(int n, int[][] roads) {
        dsu = new int[n + 1];
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dsu[i] = i;
        }
        Arrays.fill(ans, Integer.MAX_VALUE);
        for (int[] r : roads) {
            int a = find(r[0]);
            int b = find(r[1]);
            dsu[a] = dsu[b];
            ans[a] = ans[b] = Math.min(r[2], Math.min(ans[a], ans[b]));
        }
        return ans[find(1)];
    }

    private int find(int i) {
        return dsu[i] == i ? i : find(dsu[i]);
    }
}
