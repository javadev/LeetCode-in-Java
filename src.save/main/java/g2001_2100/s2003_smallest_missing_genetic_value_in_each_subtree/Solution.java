package g2001_2100.s2003_smallest_missing_genetic_value_in_each_subtree;

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Union_Find
// #2022_05_22_Time_126_ms_(85.18%)_Space_154.3_MB_(66.67%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] smallestMissingValueSubtree(int[] parents, int[] nums) {
        int[] ans = new int[parents.length];
        Node[] all = new Node[parents.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            all[i] = new Node(i, nums[i]);
            max = Math.max(max, nums[i]);
        }
        for (int i = 1; i < parents.length; i++) {
            all[parents[i]].nodes.add(all[i]);
        }
        solve(all[0], ans, new UF(++max, nums));
        return ans;
    }

    private void solve(Node root, int[] ans, UF uf) {
        int max = 1;
        for (Node child : root.nodes) {
            solve(child, ans, uf);
            uf.union(root.val, child.val);
            max = Math.max(ans[child.idx], max);
        }
        while (max <= ans.length && uf.isConnected(max, root.val)) {
            ++max;
        }
        ans[root.idx] = max;
    }

    private static class Node {
        int idx;
        int val;
        List<Node> nodes;

        Node(int idx, int val) {
            this.idx = idx;
            this.val = val;
            nodes = new ArrayList<>();
        }
    }

    private static class UF {
        int[] rank;
        int[] parent;

        UF(int n, int[] nums) {
            rank = new int[n];
            parent = new int[n];
            for (int m : nums) {
                parent[m] = m;
            }
        }

        private int find(int x) {
            if (x == parent[x]) {
                return x;
            }
            parent[x] = find(parent[x]);
            return parent[x];
        }

        private void union(int x, int y) {
            x = find(x);
            y = find(y);
            if (rank[x] > rank[y]) {
                parent[y] = x;
            } else {
                parent[x] = y;
                if (rank[x] == rank[y]) {
                    rank[y]++;
                }
            }
        }

        private boolean isConnected(int x, int y) {
            return find(x) == find(y);
        }
    }
}
