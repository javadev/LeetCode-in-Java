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
        for (Map.Entry<Integer, Integer> d1 : degreeCount.entrySet()) {
            for (Map.Entry<Integer, Integer> d2 : degreeCount.entrySet()) {
                count[d1.getKey() + d2.getKey()] +=
                        (d1 == d2)
                                ? d1.getValue() * (d1.getValue() - 1)
                                : d1.getValue() * d2.getValue();
            }
        }
        for (int i = 0; i < count.length; i++) {
            count[i] /= 2;
        }
        for (Map.Entry<Integer, Integer> e : edgeCount.entrySet()) {
            int u = e.getKey() / n;
            int v = e.getKey() % n;
            count[degree[u] + degree[v]]--;
            count[degree[u] + degree[v] - e.getValue()]++;
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
