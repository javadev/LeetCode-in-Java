package g2901_3000.s2925_maximum_score_after_applying_operations_on_a_tree;

// #Medium #Dynamic_Programming #Depth_First_Search #Tree
// #2023_12_29_Time_22_ms_(79.74%)_Space_57.1_MB_(70.30%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public long maximumScoreAfterOperations(int[][] edges, int[] values) {
        long sum = 0;
        int n = values.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        for (int value : values) {
            sum += value;
        }
        long x = dfs(0, -1, adj, values);
        return sum - x;
    }

    private long dfs(int node, int parent, List<List<Integer>> adj, int[] values) {
        if (adj.get(node).size() == 1 && node != 0) {
            return values[node];
        }
        long sum = 0;
        for (int child : adj.get(node)) {
            if (child != parent) {
                sum += dfs(child, node, adj, values);
            }
        }
        return Math.min(sum, values[node]);
    }
}
