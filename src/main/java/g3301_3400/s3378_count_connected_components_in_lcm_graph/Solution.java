package g3301_3400.s3378_count_connected_components_in_lcm_graph;

// #Hard #Array #Hash_Table #Math #Union_Find #Number_Theory
// #2024_12_10_Time_68_ms_(67.83%)_Space_59.8_MB_(62.24%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static class Unionfind {
        int[] parent;
        int[] rank;
        int totalComponents;

        public Unionfind(int n) {
            parent = new int[n];
            rank = new int[n];
            totalComponents = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int u) {
            if (parent[u] == u) {
                return u;
            }
            parent[u] = find(parent[u]);
            return parent[u];
        }

        public void union(int u, int v) {
            int parentU = find(u);
            int parentV = find(v);
            if (parentU != parentV) {
                totalComponents--;
                if (rank[parentU] == rank[parentV]) {
                    parent[parentV] = parentU;
                    rank[parentU]++;
                } else if (rank[parentU] > rank[parentV]) {
                    parent[parentV] = parentU;
                } else {
                    parent[parentU] = parentV;
                }
            }
        }
    }

    public int countComponents(int[] nums, int threshold) {
        List<Integer> goodNums = new ArrayList<>();
        int totalNums = nums.length;
        for (int num : nums) {
            if (num <= threshold) {
                goodNums.add(num);
            }
        }
        if (goodNums.isEmpty()) {
            return totalNums;
        }
        Unionfind uf = new Unionfind(goodNums.size());
        int[] presentElements = new int[threshold + 1];
        Arrays.fill(presentElements, -1);
        for (int i = 0; i < goodNums.size(); i++) {
            presentElements[goodNums.get(i)] = i;
        }
        for (int d : goodNums) {
            for (int i = d; i <= threshold; i += d) {
                if (presentElements[i] == -1) {
                    presentElements[i] = presentElements[d];
                } else if (presentElements[i] != presentElements[d]) {
                    uf.union(presentElements[i], presentElements[d]);
                }
            }
        }
        return uf.totalComponents + totalNums - goodNums.size();
    }
}
