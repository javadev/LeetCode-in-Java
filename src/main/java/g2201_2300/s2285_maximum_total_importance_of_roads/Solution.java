package g2201_2300.s2285_maximum_total_importance_of_roads;

// #Medium #Sorting #Greedy #Heap_Priority_Queue #Graph
// #2022_06_18_Time_54_ms_(41.07%)_Space_129.2_MB_(19.05%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] degree = new int[n];
        int maxdegree = 0;
        for (int[] r : roads) {
            degree[r[0]]++;
            degree[r[1]]++;
            maxdegree = Math.max(maxdegree, Math.max(degree[r[0]], degree[r[1]]));
        }
        Map<Integer, Integer> rank = new HashMap<>();
        int i = n;
        while (i > 0) {
            for (int j = 0; j < n; j++) {
                if (degree[j] == maxdegree) {
                    rank.put(j, i--);
                    degree[j] = Integer.MIN_VALUE;
                }
            }
            maxdegree = 0;
            for (int d : degree) {
                maxdegree = Math.max(maxdegree, d);
            }
        }
        long res = 0;
        for (int[] r : roads) {
            res += rank.get(r[0]) + rank.get(r[1]);
        }
        return res;
    }
}
