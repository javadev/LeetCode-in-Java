package g2601_2700.s2608_shortest_cycle_in_a_graph;

// #Hard #Breadth_First_Search #Graph #2023_08_30_Time_11_ms_(100.00%)_Space_44_MB_(76.40%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private int output = 1001;

    public int findShortestCycle(int n, int[][] edges) {
        List<Integer>[] nexts = new ArrayList[n];
        int[] ranks = new int[n];
        for (int i = 0; i < n; i++) {
            nexts[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            for (int i = 0; i < 2; i++) {
                nexts[edge[i]].add(edge[1 - i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (ranks[i] == 0) {
                findShortestCycle(nexts, i, -1, -1001, ranks);
            }
        }
        return output == 1001 ? -1 : output;
    }

    private void findShortestCycle(List<Integer>[] nexts, int c, int p, int r, int[] ranks) {
        ranks[c] = r;
        for (int n : nexts[c]) {
            if (n != p) {
                if (ranks[n] > r + 1) {
                    findShortestCycle(nexts, n, c, r + 1, ranks);
                } else if (ranks[c] > ranks[n]) {
                    output = Math.min(output, ranks[c] - ranks[n] + 1);
                }
            }
        }
    }
}
