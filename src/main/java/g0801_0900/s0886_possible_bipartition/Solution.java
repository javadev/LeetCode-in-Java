package g0801_0900.s0886_possible_bipartition;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #Graph_Theory_I_Day_14_Graph_Theory #2022_03_28_Time_20_ms_(80.12%)_Space_75.6_MB_(32.57%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        // build graph
        Graph g = new Graph(n);
        for (int[] dislike : dislikes) {
            g.addEdge(dislike[0] - 1, dislike[1] - 1);
        }
        boolean[] marked = new boolean[n];
        boolean[] colors = new boolean[n];
        for (int v = 0; v < n; v++) {
            if (!marked[v] && !checkBipartiteDFS(g, marked, colors, v)) {
                // No need to run on other connected components if one component has failed.
                return false;
            }
        }
        return true;
    }

    private boolean checkBipartiteDFS(Graph g, boolean[] marked, boolean[] colors, int v) {
        marked[v] = true;
        for (int w : g.adj(v)) {
            if (!marked[w]) {
                colors[w] = !colors[v];
                if (!checkBipartiteDFS(g, marked, colors, w)) {
                    // this is to break for other neighbours
                    return false;
                }
            } else if (colors[v] == colors[w]) {
                return false;
            }
        }
        return true;
    }

    private static class Graph {
        private ArrayList<Integer>[] adj;

        public Graph(int v) {
            adj = new ArrayList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        private void addEdge(int v, int w) {
            adj[v].add(w);
            adj[w].add(v);
        }

        private List<Integer> adj(int v) {
            return adj[v];
        }
    }
}
