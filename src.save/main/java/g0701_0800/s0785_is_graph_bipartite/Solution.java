package g0701_0800.s0785_is_graph_bipartite;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #Graph_Theory_I_Day_14_Graph_Theory #2022_03_26_Time_0_ms_(100.00%)_Space_54.3_MB_(18.06%)

public class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            if (color[i] == 0 && !helper(graph, i, -1, color)) {
                return false;
            }
        }
        return true;
    }

    private boolean helper(int[][] graph, int curr, int c, int[] color) {
        if (color[curr] == c) {
            return true;
        }
        color[curr] = c;
        for (int x : graph[curr]) {
            if (color[x] == c || !helper(graph, x, c * -1, color)) {
                return false;
            }
        }
        return true;
    }
}
