package g2601_2700.s2685_count_the_number_of_complete_components;

// #Medium #Array #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Matrix #Graph
// #2023_09_12_Time_5_ms_(98.65%)_Space_43.8_MB_(65.96%)

public class Solution {
    private static class DSU {
        int[] roots;
        int[] sizes;

        DSU(int n) {
            roots = new int[n];
            sizes = new int[n];
            for (int i = 0; i < n; i++) {
                sizes[i] = 1;
                roots[i] = i;
            }
        }

        public int find(int v) {
            if (roots[v] != v) {
                roots[v] = find(roots[v]);
            }
            return roots[v];
        }

        public void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);
            if (rootA == rootB) {
                return;
            }
            roots[rootB] = rootA;
            sizes[rootA] += sizes[rootB];
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        DSU dsu = new DSU(n);
        int[] indegree = new int[n];
        for (int[] e : edges) {
            dsu.union(e[0], e[1]);
            indegree[e[0]]++;
            indegree[e[1]]++;
        }
        int[] gcount = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            int root = dsu.find(i);
            if (dsu.sizes[root] == (indegree[i] + 1)) {
                gcount[root]++;
            }
            if (gcount[root] == dsu.sizes[root]) {
                res++;
            }
        }
        return res;
    }
}
