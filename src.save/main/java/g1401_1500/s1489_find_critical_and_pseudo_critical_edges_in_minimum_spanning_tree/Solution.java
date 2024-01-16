package g1401_1500.s1489_find_critical_and_pseudo_critical_edges_in_minimum_spanning_tree;

// #Hard #Sorting #Graph #Union_Find #Minimum_Spanning_Tree #Strongly_Connected_Component
// #2022_04_05_Time_17_ms_(100.00%)_Space_42.8_MB_(86.75%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@SuppressWarnings({"unchecked", "java:S106"})
public class Solution {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        // {w, ind}
        int[][][] g = new int[n][n][2];
        for (int i = 0; i < edges.length; i++) {
            int[] e = edges[i];
            int f = e[0];
            int t = e[1];
            int w = e[2];
            g[f][t][0] = w;
            g[t][f][0] = w;
            g[f][t][1] = i;
            g[t][f][1] = i;
        }
        List<Integer>[] mst = new List[n];
        for (int i = 0; i < n; i++) {
            mst[i] = new LinkedList<>();
        }
        boolean[] mstSet = new boolean[edges.length];
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));
        buildMST(n, edges, mstSet, mst, g);
        List<List<Integer>> ans = new ArrayList<>(2);
        Set<Integer> pce = new HashSet<>();
        List<Integer> ce = new LinkedList<>();
        // pseudo critical edges
        for (int[] edge : edges) {
            int f = edge[0];
            int t = edge[1];
            int w = edge[2];
            int ind = g[f][t][1];
            if (!mstSet[ind]) {
                Set<Integer> cur = new HashSet<>();
                boolean p = path(f, t, w, -1, mst, g, cur);
                if (p && !cur.isEmpty()) {
                    pce.addAll(cur);
                    pce.add(ind);
                }
                if (!p) {
                    System.out.println("Should not reach here");
                }
            }
        }
        // critical edges
        for (int[] edge : edges) {
            int f = edge[0];
            int t = edge[1];
            int ind = g[f][t][1];
            if (mstSet[ind] && !pce.contains(ind)) {
                ce.add(ind);
            }
        }
        ans.add(ce);
        ans.add(new LinkedList<>(pce));
        return ans;
    }

    private boolean path(
            int f, int t, int w, int p, List<Integer>[] mst, int[][][] g, Set<Integer> ind) {
        if (f == t) {
            return true;
        }
        for (int nbr : mst[f]) {
            if (p != nbr && path(nbr, t, w, f, mst, g, ind)) {
                if (g[f][nbr][0] == w) {
                    ind.add(g[f][nbr][1]);
                }
                return true;
            }
        }
        return false;
    }

    private void buildMST(int n, int[][] edges, boolean[] mste, List<Integer>[] mstg, int[][][] g) {
        DisjointSet ds = new DisjointSet(n);
        for (int[] ints : edges) {
            if (ds.union(ints[0], ints[1])) {
                int[] edge = ints;
                mstg[edge[0]].add(edge[1]);
                mstg[edge[1]].add(edge[0]);
                mste[g[edge[0]][edge[1]][1]] = true;
            }
        }
    }

    private static class DisjointSet {
        int[] parent;

        public DisjointSet(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int i) {
            if (i == parent[i]) {
                return i;
            }
            parent[i] = find(parent[i]);
            return parent[i];
        }

        public boolean union(int u, int v) {
            int pu = find(u);
            int pv = find(v);
            if (pu == pv) {
                return false;
            }
            parent[pu] = pv;
            return true;
        }
    }
}
