package g3701_3800.s3786_total_sum_of_interaction_cost_in_tree_groups;

// #Hard #Array #Tree #Senior_Staff #Weekly_Contest_481 #Depth_First_Search
// #2026_05_22_Time_82_ms_(90.67%)_Space_296.78_MB_(21.33%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private long totalCost = 0;
    private int[][] counts;
    private int[] totalInGroup;
    private List<List<Integer>> adj;

    public long interactionCosts(int n, int[][] edges, int[] group) {
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        totalInGroup = new int[21];
        for (int g : group) {
            totalInGroup[g]++;
        }
        counts = new int[n][21];
        dfs(0, -1, group);
        return totalCost;
    }

    private void dfs(int u, int p, int[] group) {
        counts[u][group[u]] = 1;
        for (int v : adj.get(u)) {
            if (v == p) {
                continue;
            }
            dfs(v, u, group);
            for (int g = 1; g <= 20; g++) {
                if (totalInGroup[g] < 2) {
                    continue;
                }
                long inSubtree = counts[v][g];
                long outsideSubtree = totalInGroup[g] - inSubtree;
                totalCost += inSubtree * outsideSubtree;
                counts[u][g] += counts[v][g];
            }
        }
    }
}
