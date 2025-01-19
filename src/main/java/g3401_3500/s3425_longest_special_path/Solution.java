package g3401_3500.s3425_longest_special_path;

// #Hard #2025_01_19_Time_57_(100.00%)_Space_94.11_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Solution {
    private ArrayList<int[]>[] adj;
    private int[] nums;
    private int[] dist;
    private int[] lastOccur;
    private ArrayList<Integer> pathStack;
    private int minIndex;
    private int maxLen;
    private int minNodesForMaxLen;

    public int[] longestSpecialPath(int[][] edges, int[] nums) {
        int n = nums.length;
        this.nums = nums;
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            adj[u].add(new int[] {v, w});
            adj[v].add(new int[] {u, w});
        }
        dist = new int[n];
        buildDist(0, -1, 0);
        int maxVal = 0;
        for (int val : nums) {
            if (val > maxVal) {
                maxVal = val;
            }
        }
        lastOccur = new int[maxVal + 1];
        Arrays.fill(lastOccur, -1);
        pathStack = new ArrayList<>();
        minIndex = 0;
        maxLen = 0;
        minNodesForMaxLen = Integer.MAX_VALUE;
        dfs(0, -1);
        return new int[] {maxLen, minNodesForMaxLen};
    }

    private void buildDist(int u, int parent, int currDist) {
        dist[u] = currDist;
        for (int[] edge : adj[u]) {
            int v = edge[0], w = edge[1];
            if (v == parent) continue;
            buildDist(v, u, currDist + w);
        }
    }

    private void dfs(int u, int parent) {
        int stackPos = pathStack.size();
        pathStack.add(u);
        int val = nums[u];
        int oldPos = lastOccur[val];
        int oldMinIndex = minIndex;
        lastOccur[val] = stackPos;
        if (oldPos >= minIndex) {
            minIndex = oldPos + 1;
        }
        if (minIndex <= stackPos) {
            int ancestor = pathStack.get(minIndex);
            int pathLength = dist[u] - dist[ancestor];
            int pathNodes = stackPos - minIndex + 1;
            if (pathLength > maxLen) {
                maxLen = pathLength;
                minNodesForMaxLen = pathNodes;
            } else if (pathLength == maxLen && pathNodes < minNodesForMaxLen) {
                minNodesForMaxLen = pathNodes;
            }
        }
        for (int[] edge : adj[u]) {
            int v = edge[0];
            if (v == parent) continue;
            dfs(v, u);
        }
        pathStack.remove(pathStack.size() - 1);
        lastOccur[val] = oldPos;
        minIndex = oldMinIndex;
    }
}
