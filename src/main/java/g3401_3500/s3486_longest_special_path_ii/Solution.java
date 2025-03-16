package g3401_3500.s3486_longest_special_path_ii;

// #Hard #2025_03_16_Time_1831_ms_(_%)_Space_87.71_MB_(_%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int MAX_VAL = 50000;
    private int dupCount;
    private int overCount;
    private long ansLength;
    private int ansNodes;
    private int[] nums;
    private List<List<int[]>> adj;
    private int[] path;
    private long[] dist;
    private int[] freq;

    public int[] longestSpecialPath(int[][] edges, int[] nums) {
        int n = nums.length;
        this.nums = nums;
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        // Build the undirected tree (rooted at 0)
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];
            adj.get(u).add(new int[] {v, w});
            adj.get(v).add(new int[] {u, w});
        }
        // Preallocate DFS chain arrays
        path = new int[n];
        dist = new long[n];
        freq = new int[MAX_VAL + 1];
        ansLength = 0;
        ansNodes = Integer.MAX_VALUE;
        dupCount = 0;
        overCount = 0;
        // Start DFS from root, with left pointer L = 0 and current depth = 0.
        dfs(0, -1, 0, 0, 0);
        return new int[] {(int) ansLength, ansNodes};
    }

    // The window [L, depth] (indices into the DFS chain) is valid if:
    //   – overCount == 0 (no value appears 3+ times)
    //   – dupCount <= 1 (at most one value appears exactly twice)
    private boolean valid() {
        return overCount == 0 && dupCount <= 1;
    }

    // DFS parameters:
    //   node: current node,
    //   parent: parent in DFS tree,
    //   curDist: cumulative distance from root to current node,
    //   L: left pointer index of the valid window (in the DFS chain),
    //   depth: current index in the DFS chain.
    private void dfs(int node, int parent, long curDist, int l, int depth) {
        path[depth] = node;
        dist[depth] = curDist;
        // Update frequency for current node's value.
        int v = nums[node];
        int old = freq[v];
        if (old == 0) {
            freq[v] = 1;
        } else if (old == 1) {
            freq[v] = 2;
            dupCount++;
        } else if (old == 2) {
            freq[v] = 3;
            overCount++;
            dupCount--;
        }
        // Save original left pointer.
        int origL = l;
        // We'll slide newL forward as needed.
        int newL = l;
        // Slide the window [newL, depth] until it is valid.
        while (!valid() && newL < depth) {
            int remNode = path[newL];
            int remVal = nums[remNode];
            if (freq[remVal] == 1) {
                freq[remVal] = 0;
            } else if (freq[remVal] == 2) {
                freq[remVal] = 1;
                dupCount--;
            } else if (freq[remVal] == 3) {
                freq[remVal] = 2;
                overCount--;
                // now this value counts as a duplicate.
                dupCount++;
            }
            newL++;
        }
        // Now window [newL, depth] is valid.
        // Compute current path length: difference of cumulative distances.
        long curPathLength = newL == depth ? 0L : dist[depth] - dist[newL];
        int nodeCount = depth - newL + 1;
        if (curPathLength > ansLength) {
            ansLength = curPathLength;
            ansNodes = nodeCount;
        } else if (curPathLength == ansLength && nodeCount < ansNodes) {
            ansNodes = nodeCount;
        }
        // Recurse for children using the updated left pointer newL.
        for (int[] p : adj.get(node)) {
            int child = p[0];
            int w = p[1];
            if (child == parent) {
                continue;
            }
            dfs(child, node, curDist + w, newL, depth + 1);
        }
        // Backtracking: Restore frequency values for nodes removed from the window.
        // That is, for indices i from newL-1 downto origL, undo the removal.
        for (int i = newL - 1; i >= origL; i--) {
            int remNode = path[i];
            int remVal = nums[remNode];
            if (freq[remVal] == 0) {
                freq[remVal] = 1;
            } else if (freq[remVal] == 1) {
                freq[remVal] = 2;
                dupCount++;
            } else if (freq[remVal] == 2) {
                freq[remVal] = 3;
                overCount++;
                dupCount--;
            }
        }
        // Finally, remove current node's contribution.
        if (freq[v] == 1) {
            freq[v] = 0;
        } else if (freq[v] == 2) {
            freq[v] = 1;
            dupCount--;
        } else if (freq[v] == 3) {
            freq[v] = 2;
            overCount--;
            dupCount++;
        }
    }
}
