package g3701_3800.s3710_maximum_partition_factor;

// #Hard #Biweekly_Contest_167 #2025_10_12_Time_304_ms_(50.00%)_Space_55.99_MB_(50.00%)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int maxPartitionFactor(int[][] arr) {
        int n = arr.length;
        if (n == 2) {
            return 0;
        }
        // Step 1: Create list of (distance, i, j)
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int d = Math.abs(arr[i][0] - arr[j][0]) + Math.abs(arr[i][1] - arr[j][1]);
                edges.add(new int[] {d, i, j});
            }
        }
        // Step 2: Sort by distance
        edges.sort(Comparator.comparingInt(a -> a[0]));
        // Step 3: Union-Find setup
        int[] parent = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            weight[i] = 1;
        }
        Map<Integer, Integer> opp = new HashMap<>();
        // Step 4: Process edges
        for (int[] e : edges) {
            int d = e[0];
            int i = e[1];
            int j = e[2];
            if (find(i, parent) == find(j, parent)) {
                return d;
            }
            if (opp.containsKey(i)) {
                union(opp.get(i), j, parent, weight);
            }
            if (opp.containsKey(j)) {
                union(opp.get(j), i, parent, weight);
            }
            opp.put(i, j);
            opp.put(j, i);
        }
        return edges.get(edges.size() - 1)[0];
    }

    private int find(int a, int[] parent) {
        if (parent[a] != a) {
            parent[a] = find(parent[a], parent);
        }
        return parent[a];
    }

    private void union(int x, int y, int[] parent, int[] weight) {
        x = find(x, parent);
        y = find(y, parent);
        if (x == y) {
            return;
        }
        if (weight[x] < weight[y]) {
            int temp = x;
            x = y;
            y = temp;
        }
        weight[y] += weight[x];
        parent[x] = y;
    }
}
