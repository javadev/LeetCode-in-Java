package g3801_3900.s3812_minimum_edge_toggles_on_a_tree;

// #Hard #Sorting #Tree #Topological_Sort #Senior_Staff #Depth_First_Search #Biweekly_Contest_174
// #Graph_Theory #2026_06_09_Time_89_ms_(86.67%)_Space_303.92_MB_(28.33%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    private boolean[] visited;
    private List<int[]>[] adjList;
    private int[] flips;
    private List<Integer> ans;
    private String s;
    private String t;

    public List<Integer> minimumFlips(int n, int[][] edges, String start, String target) {
        s = start;
        t = target;
        flips = new int[n];
        adjList = new List[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            adjList[edge[0]].add(new int[] {edge[1], i});
            adjList[edge[1]].add(new int[] {edge[0], i});
        }

        ans = new ArrayList<>();
        visited = new boolean[n];

        dfs(0, -1, -1);

        // Sort indices as required
        Collections.sort(ans);

        // If root is still mismatched, it's impossible (no parent to flip)
        if (mismatch(0)) {
            ans = new ArrayList<>();
            ans.add(-1);
        }
        return ans;
    }

    // Helper to check if current state matches target
    // Logic: If flips is even, bit is original. If flips is odd, bit is inverted.
    private boolean mismatch(int u) {
        return ((flips[u] % 2 == 0) && s.charAt(u) != t.charAt(u))
                || ((flips[u] % 2 == 1) && s.charAt(u) == t.charAt(u));
    }

    private void dfs(int u, int parent, int index) {
        visited[u] = true;
        for (int[] v : adjList[u]) {
            if (!visited[v[0]]) {
                dfs(v[0], u, v[1]);
            }
        }

        if (parent != -1 && (mismatch(u))) {
            ans.add(index);
            flips[u]++;
            flips[parent]++;
        }
    }
}
