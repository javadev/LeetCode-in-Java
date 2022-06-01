package g1601_1700.s1617_count_subtrees_with_max_distance_between_cities;

// #Hard #Dynamic_Programming #Tree #Bit_Manipulation #Bitmask #Enumeration
// #2022_04_13_Time_52_ms_(78.95%)_Space_43.1_MB_(52.63%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("java:S5329")
public class Solution {
    private int ans = 0;
    private int vis = 0;

    public int[] countSubgraphsForEachDiameter(int n, int[][] edges) {
        ans = 0;
        vis = 0;
        int[] dist = new int[n - 1];
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] i : edges) {
            graph.computeIfAbsent(1 << (i[0] - 1), ArrayList::new).add((1 << (i[1] - 1)));
            graph.computeIfAbsent(1 << (i[1] - 1), ArrayList::new).add((1 << (i[0] - 1)));
        }
        int ps = ((int) Math.pow(2, n)) - 1;
        for (int set = 3; set <= ps; set++) {
            // is power of 2
            boolean isp2 = set != 0 && ((set & (set - 1)) == 0);
            if (!isp2) {
                ans = 0;
                vis = 0;
                dfs(graph, set, Integer.highestOneBit(set), -1);
                if (vis == set) {
                    dist[ans - 1]++;
                }
            }
        }
        return dist;
    }

    private int dfs(Map<Integer, List<Integer>> graph, int set, int c, int p) {
        if ((set & c) == 0) {
            return 0;
        }
        vis = vis | c;
        int fdist = 0;
        int sdist = 0;
        for (int i : graph.get(c)) {
            if (i != p) {
                int dist = dfs(graph, set, i, c);
                if (dist > fdist) {
                    sdist = fdist;
                    fdist = dist;
                } else {
                    sdist = Math.max(sdist, dist);
                }
            }
        }
        ans = Math.max(ans, fdist + sdist);
        return 1 + fdist;
    }
}
