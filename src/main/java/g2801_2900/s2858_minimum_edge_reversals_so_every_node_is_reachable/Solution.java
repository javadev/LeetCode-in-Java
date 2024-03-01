package g2801_2900.s2858_minimum_edge_reversals_so_every_node_is_reachable;

// #Hard #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Graph
// #2023_12_19_Time_52_ms_(92.31%)_Space_119.5_MB_(75.38%)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class Solution {
    public int[] minEdgeReversals(int n, int[][] edges) {
        List<int[]>[] nexts = new List[n];
        for (int i = 0; i < n; i++) {
            nexts[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            nexts[u].add(new int[] {1, v});
            nexts[v].add(new int[] {-1, u});
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }
        res[0] = dfs(nexts, 0, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            Integer index = queue.remove();
            int val = res[index];
            List<int[]> next = nexts[index];
            for (int[] node : next) {
                if (res[node[1]] == -1) {
                    if (node[0] == 1) {
                        res[node[1]] = val + 1;
                    } else {
                        res[node[1]] = val - 1;
                    }
                    queue.add(node[1]);
                }
            }
        }
        return res;
    }

    private int dfs(List<int[]>[] nexts, int index, int pre) {
        int res = 0;
        List<int[]> next = nexts[index];
        for (int[] node : next) {
            if (node[1] != pre) {
                if (node[0] == -1) {
                    res++;
                }
                res += dfs(nexts, node[1], index);
            }
        }
        return res;
    }
}
