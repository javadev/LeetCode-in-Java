package g0801_0900.s0886_possible_bipartition;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find

import java.util.ArrayList;
import java.util.List;

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
            if (!marked[v]) {
                if (!checkBipartiteDFS(g, marked, colors, v)) {
                    // No need to run on other connected components if one component has failed.
                    return false;
                }
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
        private int v;

        public Graph(int v) {
            this.v = v;
            adj = (ArrayList<Integer>[]) new ArrayList[v];
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
