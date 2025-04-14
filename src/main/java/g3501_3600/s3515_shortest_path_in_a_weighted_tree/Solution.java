package g3501_3600.s3515_shortest_path_in_a_weighted_tree;

// #Hard #Array #Tree #Segment_Tree #Binary_Indexed_Tree #Depth_First_Search
// #2025_04_14_Time_38_ms_(100.00%)_Space_146.46_MB_(100.00%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private int[] in;
    private int[] out;
    private int[] baseDist;
    private int[] parent;
    private int[] depth;
    private int timer = 0;
    private int[] edgeWeight;
    private List<int[]>[] adj;

    public int[] treeQueries(int n, int[][] edges, int[][] queries) {
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];
            adj[u].add(new int[] {v, w});
            adj[v].add(new int[] {u, w});
        }
        in = new int[n + 1];
        out = new int[n + 1];
        baseDist = new int[n + 1];
        parent = new int[n + 1];
        depth = new int[n + 1];
        edgeWeight = new int[n + 1];
        dfs(1, 0, 0);
        Fen fenw = new Fen(n);
        List<Integer> ansList = new ArrayList<>();
        for (int[] query : queries) {
            if (query[0] == 1) {
                int u = query[1];
                int v = query[2];
                int newW = query[3];
                int child;
                if (parent[v] == u) {
                    child = v;
                } else if (parent[u] == v) {
                    child = u;
                } else {
                    continue;
                }
                int diff = newW - edgeWeight[child];
                edgeWeight[child] = newW;
                fenw.updateRange(in[child], out[child], diff);
            } else {
                int x = query[1];
                int delta = fenw.query(in[x]);
                ansList.add(baseDist[x] + delta);
            }
        }
        int[] answer = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            answer[i] = ansList.get(i);
        }
        return answer;
    }

    private void dfs(int node, int par, int dist) {
        parent[node] = par;
        baseDist[node] = dist;
        depth[node] = (par == 0) ? 0 : depth[par] + 1;
        in[node] = ++timer;
        for (int[] neighborInfo : adj[node]) {
            int neighbor = neighborInfo[0];
            int w = neighborInfo[1];
            if (neighbor == par) {
                continue;
            }
            edgeWeight[neighbor] = w;
            dfs(neighbor, node, dist + w);
        }
        out[node] = timer;
    }

    private static class Fen {
        int n;
        int[] fenw;

        public Fen(int n) {
            this.n = n;
            fenw = new int[n + 2];
        }

        private void update(int i, int delta) {
            while (i <= n) {
                fenw[i] += delta;
                i += i & -i;
            }
        }

        public void updateRange(int l, int r, int delta) {
            update(l, delta);
            update(r + 1, -delta);
        }

        public int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += fenw[i];
                i -= i & -i;
            }
            return sum;
        }
    }
}
