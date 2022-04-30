package g1701_1800.s1782_count_pairs_of_nodes;

// #Hard #Binary_Search #Two_Pointers #Graph
// #2022_04_30_Time_128_ms_(86.96%)_Space_175.4_MB_(39.13%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] countPairs(int n, int[][] edges, int[] queries) {
        Map<Integer, Integer> edgeCount = new HashMap<>();
        int[] degree = new int[n];

        for (int[] e : edges) {
            int u = e[0] - 1;
            int v = e[1] - 1;
            degree[u]++;
            degree[v]++;

            int eId = Math.min(u, v) * n + Math.max(u, v);
            edgeCount.put(eId, edgeCount.getOrDefault(eId, 0) + 1);
        }

        Map<Integer, Integer> degreeCount = new HashMap<>();
        int maxDegree = 0;
        for (int d : degree) {
            degreeCount.put(d, degreeCount.getOrDefault(d, 0) + 1);
            maxDegree = Math.max(maxDegree, d);
        }

        int[] count = new int[2 * maxDegree + 1];

        for (int d1 : degreeCount.keySet()) {
            for (int d2 : degreeCount.keySet()) {
                count[d1 + d2] +=
                        (d1 == d2)
                                ? degreeCount.get(d1) * (degreeCount.get(d1) - 1)
                                : degreeCount.get(d1) * degreeCount.get(d2);
            }
        }
        for (int i = 0; i < count.length; i++) {
            count[i] /= 2;
        }

        for (int e : edgeCount.keySet()) {
            int u = e / n;
            int v = e % n;

            count[degree[u] + degree[v]]--;
            count[degree[u] + degree[v] - edgeCount.get(e)]++;
        }

        for (int i = count.length - 2; i >= 0; i--) {
            count[i] += count[i + 1];
        }

        int[] res = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            res[q] = ((queries[q] + 1) >= count.length) ? 0 : count[queries[q] + 1];
        }
        return res;
    }
}
