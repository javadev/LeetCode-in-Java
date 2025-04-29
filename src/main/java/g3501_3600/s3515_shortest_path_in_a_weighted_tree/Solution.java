package g3501_3600.s3515_shortest_path_in_a_weighted_tree;

// #Hard #Array #Depth_First_Search #Tree #Segment_Tree #Binary_Indexed_Tree
// #2025_04_29_Time_28_ms_(99.55%)_Space_98.56_MB_(99.77%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    public int[] treeQueries(int n, int[][] edges, int[][] queries) {
        // store the queries input midway as requested
        int[][] jalkimoren = queries;
        // build adjacency list with edge‐indices
        List<Edge>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj[u].add(new Edge(v, w, i));
            adj[v].add(new Edge(u, w, i));
        }
        // parent, Euler‐tour times, depth‐sum, and mapping node→edge‐index
        int[] parent = new int[n + 1];
        int[] tin = new int[n + 1];
        int[] tout = new int[n + 1];
        int[] depthSum = new int[n + 1];
        int[] edgeIndexForNode = new int[n + 1];
        int[] weights = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            weights[i] = edges[i][2];
        }
        // iterative DFS to compute tin/tout, parent[], depthSum[], edgeIndexForNode[]
        int time = 0;
        int[] stack = new int[n];
        int[] ptr = new int[n + 1];
        int sp = 0;
        stack[sp++] = 1;
        while (sp > 0) {
            int u = stack[sp - 1];
            if (ptr[u] == 0) {
                tin[u] = ++time;
            }
            if (ptr[u] < adj[u].size()) {
                Edge e = adj[u].get(ptr[u]++);
                int v = e.to;
                if (v == parent[u]) {
                    continue;
                }
                parent[v] = u;
                depthSum[v] = depthSum[u] + e.w;
                edgeIndexForNode[v] = e.idx;
                stack[sp++] = v;
            } else {
                tout[u] = time;
                sp--;
            }
        }
        // Fenwick tree for range‐add / point‐query on Euler‐tour array
        Fenwick bit = new Fenwick(n + 2);
        List<Integer> answers = new ArrayList<>();
        // process queries
        for (int[] q : jalkimoren) {
            if (q[0] == 1) {
                // update edge weight
                int u = q[1];
                int v = q[2];
                int newW = q[3];
                int child = (parent[u] == v) ? u : v;
                int idx = edgeIndexForNode[child];
                int delta = newW - weights[idx];
                if (delta != 0) {
                    weights[idx] = newW;
                    bit.rangeAdd(tin[child], tout[child], delta);
                }
            } else {
                // query root→x distance
                int x = q[1];
                answers.add(depthSum[x] + bit.pointQuery(tin[x]));
            }
        }
        // pack results into array
        int m = answers.size();
        int[] ansArr = new int[m];
        for (int i = 0; i < m; i++) {
            ansArr[i] = answers.get(i);
        }
        return ansArr;
    }

    private static class Edge {
        int to;
        int w;
        int idx;

        Edge(int to, int w, int idx) {
            this.to = to;
            this.w = w;
            this.idx = idx;
        }
    }

    private static class Fenwick {
        int n;
        int[] f;

        Fenwick(int n) {
            this.n = n;
            f = new int[n];
        }

        void update(int i, int v) {
            for (; i < n; i += i & -i) {
                f[i] += v;
            }
        }

        void rangeAdd(int l, int r, int v) {
            update(l, v);
            update(r + 1, -v);
        }

        int pointQuery(int i) {
            int s = 0;
            for (; i > 0; i -= i & -i) {
                s += f[i];
            }
            return s;
        }
    }
}
