package g3501_3600.s3590_kth_smallest_path_xor_sum;

// #Hard #2025_06_22_Time_342_ms_(100.00%)_Space_89.24_MB_(100.00%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Solution {

    private static class OrderStatisticSet {
        private final TreeSet<Integer> set = new TreeSet<>();
        private final ArrayList<Integer> list = new ArrayList<>();

        public void insert(int x) {
            if (set.add(x)) {
                int pos = Collections.binarySearch(list, x);
                if (pos < 0) {
                    pos = -(pos + 1);
                }
                list.add(pos, x);
            }
        }

        public void insertAll(OrderStatisticSet other) {
            for (int val : other.list) {
                this.insert(val);
            }
        }

        public int size() {
            return set.size();
        }

        // Returns the k-th smallest element (0-based)
        public int findByOrder(int k) {
            return list.get(k);
        }
    }

    private List<List<Integer>> adj;
    private int[] xors;
    private int[] subtreeSize;
    private int[] postorderIndex;
    private OrderStatisticSet[] nodeSets;
    private List<int[]> queries;
    private int[] result;
    private int time = 0;
    private int queryPtr = 0;

    public int[] kthSmallest(int[] parent, int[] vals, int[][] rawQueries) {
        int n = parent.length;
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        xors = new int[n];
        subtreeSize = new int[n];
        postorderIndex = new int[n];
        nodeSets = new OrderStatisticSet[n];
        // Build tree from parent array
        for (int i = 1; i < n; i++) {
            adj.get(parent[i]).add(i);
        }
        // Compute XOR and subtree sizes
        computeSubtreeInfo(0, vals[0], vals);
        // Pack queries with original indices
        queries = new ArrayList<>();
        for (int i = 0; i < rawQueries.length; i++) {
            queries.add(new int[] {rawQueries[i][0], rawQueries[i][1], i});
        }
        queries.sort(Comparator.comparingInt(a -> postorderIndex[a[0]]));
        result = new int[queries.size()];
        dfs(0);
        return result;
    }

    private void computeSubtreeInfo(int node, int currentXor, int[] vals) {
        xors[node] = currentXor;
        int size = 1;
        for (int child : adj.get(node)) {
            computeSubtreeInfo(child, currentXor ^ vals[child], vals);
            size += subtreeSize[child];
        }
        subtreeSize[node] = size;
        postorderIndex[node] = time++;
    }

    private void dfs(int node) {
        int largestChild = -1;
        int maxSize = -1;
        for (int child : adj.get(node)) {
            dfs(child);
            if (subtreeSize[child] > maxSize) {
                maxSize = subtreeSize[child];
                largestChild = child;
            }
        }
        if (largestChild == -1) {
            nodeSets[node] = new OrderStatisticSet();
        } else {
            nodeSets[node] = nodeSets[largestChild];
        }
        nodeSets[node].insert(xors[node]);
        for (int child : adj.get(node)) {
            if (child == largestChild) {
                continue;
            }
            nodeSets[node].insertAll(nodeSets[child]);
        }
        while (queryPtr < queries.size() && queries.get(queryPtr)[0] == node) {
            int k = queries.get(queryPtr)[1];
            int queryId = queries.get(queryPtr)[2];
            if (nodeSets[node].size() >= k) {
                result[queryId] = nodeSets[node].findByOrder(k - 1);
            } else {
                result[queryId] = -1;
            }
            queryPtr++;
        }
    }
}
