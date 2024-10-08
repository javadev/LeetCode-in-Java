package g3301_3400.s3310_remove_methods_from_project;

// #Medium #Graph #Depth_First_Search #Breadth_First_Search
// #2024_10_08_Time_41_ms_(99.76%)_Space_154.8_MB_(55.29%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private int[][] graph;
    private boolean[] suspicious;
    private boolean[] visited;

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        pack(invocations, n);
        suspicious = new boolean[n];
        visited = new boolean[n];
        dfs(k, true);
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (!suspicious[i] && dfs2(i)) {
                Arrays.fill(visited, false);
                dfs(k, false);
                break;
            }
        }
        ArrayList<Integer> rst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspicious[i]) {
                rst.add(i);
            }
        }
        return rst;
    }

    public void dfs(int u, boolean sus) {
        if (visited[u]) {
            return;
        }
        visited[u] = true;
        suspicious[u] = sus;
        for (int v : graph[u]) {
            dfs(v, sus);
        }
    }

    public boolean dfs2(int u) {
        if (suspicious[u]) {
            return true;
        }
        if (visited[u]) {
            return false;
        }
        visited[u] = true;
        for (int v : graph[u]) {
            if (dfs2(v)) {
                return true;
            }
        }
        return false;
    }

    private void pack(int[][] edges, int n) {
        int[] adj = new int[n];
        for (int[] edge : edges) {
            adj[edge[0]]++;
        }
        graph = new int[n][];
        for (int i = 0; i < n; i++) {
            graph[i] = new int[adj[i]];
        }
        for (int[] edge : edges) {
            graph[edge[0]][--adj[edge[0]]] = edge[1];
        }
    }
}
