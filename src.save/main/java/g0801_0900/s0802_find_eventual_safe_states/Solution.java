package g0801_0900.s0802_find_eventual_safe_states;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Topological_Sort

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<>();
        int[] vis = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (dfs(graph, i, vis)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean dfs(int[][] graph, int src, int[] vis) {
        if (vis[src] != 0) {
            return vis[src] == 2;
        }
        vis[src] = 1;
        for (int x : graph[src]) {
            if (!dfs(graph, x, vis)) {
                return false;
            }
        }
        vis[src] = 2;
        return true;
    }
}
