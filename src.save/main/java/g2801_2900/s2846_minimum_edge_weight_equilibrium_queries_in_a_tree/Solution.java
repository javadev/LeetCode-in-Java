package g2801_2900.s2846_minimum_edge_weight_equilibrium_queries_in_a_tree;

// #Hard #Array #Tree #Graph #Strongly_Connected_Component
// #2023_12_13_Time_74_ms_(66.04%)_Space_57_MB_(50.94%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S107")
public class Solution {
    private static class Node {
        int v;
        int w;

        Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    public int[] minOperationsQueries(int n, int[][] edges, int[][] queries) {
        List<List<Node>> graph = createGraph(edges, n);
        int queryCount = queries.length;
        int[] res = new int[queryCount];
        int[] parent = new int[n];
        int[] level = new int[n];
        int[][] weightFreq = new int[n][27];
        int[] freq = new int[27];
        int height = (int) (Math.log(n) / Math.log(2)) + 1;
        int[][] up = new int[n][height];
        for (int[] arr : up) {
            Arrays.fill(arr, -1);
        }
        dfs(graph, 0, 0, -1, parent, level, weightFreq, freq);
        for (int i = 0; i < n; i++) {
            up[i][0] = parent[i];
        }
        for (int i = 1; i < height; i++) {
            for (int j = 0; j < n; j++) {
                if (up[j][i - 1] == -1) {
                    up[j][i] = -1;
                    continue;
                }
                up[j][i] = up[up[j][i - 1]][i - 1];
            }
        }
        for (int i = 0; i < queryCount; i++) {
            int src = queries[i][0];
            int dest = queries[i][1];
            int lcaNode = lca(src, dest, up, height, level);
            res[i] = processResult(weightFreq[src], weightFreq[dest], weightFreq[lcaNode]);
        }
        return res;
    }

    private int lca(int src, int dest, int[][] up, int height, int[] level) {
        int curr1 = src;
        int curr2 = dest;
        int minlevel;
        if (level[curr1] > level[curr2]) {
            minlevel = level[curr2];
            curr1 = getKthAncestor(curr1, level[curr1] - level[curr2], up, height);
        } else if (level[curr1] <= level[curr2]) {
            minlevel = level[curr1];
            curr2 = getKthAncestor(curr2, level[curr2] - level[curr1], up, height);
        } else {
            minlevel = level[curr1];
        }
        if (curr1 == curr2) {
            return curr1;
        }
        int l = 0;
        int h = level[curr2];
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int p1 = getKthAncestor(curr1, minlevel - mid, up, height);
            int p2 = getKthAncestor(curr2, minlevel - mid, up, height);
            if (p1 == p2) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return getKthAncestor(curr1, minlevel - l + 1, up, height);
    }

    private int getKthAncestor(int node, int k, int[][] up, int height) {
        int curr = node;
        for (int i = 0; i < height && k >> i != 0; i++) {
            if (((1 << i) & k) != 0) {
                if (curr == -1) {
                    return -1;
                }
                curr = up[curr][i];
            }
        }
        return curr;
    }

    private int processResult(int[] freqSrc, int[] freqDest, int[] freqLCA) {
        int[] freqPath = new int[27];
        for (int i = 1; i < 27; i++) {
            freqPath[i] = freqSrc[i] + freqDest[i] - 2 * freqLCA[i];
        }
        int max = 0;
        int pathlen = 0;
        for (int i = 1; i < 27; i++) {
            max = Math.max(max, freqPath[i]);
            pathlen += freqPath[i];
        }
        return pathlen - max;
    }

    private void dfs(
            List<List<Node>> graph,
            int src,
            int currlevel,
            int p,
            int[] parent,
            int[] level,
            int[][] weightFreq,
            int[] freq) {
        parent[src] = p;
        level[src] = currlevel;
        System.arraycopy(freq, 0, weightFreq[src], 0, freq.length);
        for (Node node : graph.get(src)) {
            int v = node.v;
            int w = node.w;
            if (v != p) {
                freq[w]++;
                dfs(graph, v, currlevel + 1, src, parent, level, weightFreq, freq);
                freq[w]--;
            }
        }
    }

    private List<List<Node>> createGraph(int[][] edges, int n) {
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new Node(v, w));
            graph.get(v).add(new Node(u, w));
        }
        return graph;
    }
}
