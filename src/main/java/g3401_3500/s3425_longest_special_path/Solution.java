package g3401_3500.s3425_longest_special_path;

// #Hard #Array #Hash_Table #Depth_First_Search #Tree #Sliding_Window
// #2025_03_13_Time_48_ms_(81.52%)_Space_86.51_MB_(86.87%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    public int[] longestSpecialPath(int[][] edges, int[] nums) {
        int n = edges.length + 1;
        int max = 0;
        List<int[]>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            max = Math.max(nums[i], max);
        }
        for (int[] e : edges) {
            adj[e[0]].add(new int[] {e[1], e[2]});
            adj[e[1]].add(new int[] {e[0], e[2]});
        }
        int[] dist = new int[n];
        int[] res = new int[] {0, Integer.MAX_VALUE};
        int[] st = new int[n + 1];
        Integer[] seen = new Integer[max + 1];
        dfs(adj, nums, res, dist, seen, st, 0, -1, 0, 0);
        return res;
    }

    private void dfs(
            List<int[]>[] adj,
            int[] nums,
            int[] res,
            int[] dist,
            Integer[] seen,
            int[] st,
            int node,
            int parent,
            int start,
            int pos) {
        Integer last = seen[nums[node]];
        if (last != null && last >= start) {
            start = last + 1;
        }
        seen[nums[node]] = pos;
        st[pos] = node;
        int len = dist[node] - dist[st[start]];
        int sz = pos - start + 1;
        if (res[0] < len || res[0] == len && res[1] > sz) {
            res[0] = len;
            res[1] = sz;
        }
        for (int[] neighbor : adj[node]) {
            if (neighbor[0] == parent) {
                continue;
            }
            dist[neighbor[0]] = dist[node] + neighbor[1];
            dfs(adj, nums, res, dist, seen, st, neighbor[0], node, start, pos + 1);
        }
        seen[nums[node]] = last;
    }
}
