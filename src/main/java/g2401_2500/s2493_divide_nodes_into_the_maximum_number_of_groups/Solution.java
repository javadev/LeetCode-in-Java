package g2401_2500.s2493_divide_nodes_into_the_maximum_number_of_groups;

// #Hard #Breadth_First_Search #Graph #Union_Find
// #2023_01_27_Time_443_ms_(77.02%)_Space_47.8_MB_(77.54%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int magnificentSets(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] visited = new int[n + 1];
        Arrays.fill(visited, -1);
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int[] comp = new int[n + 1];
        int count = -1;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == -1) {
                count++;
                comp[count] = bfs(i, adj, visited, count, n);
                if (comp[count] == -1) {
                    return -1;
                }
            } else {
                comp[visited[i]] = Math.max(comp[visited[i]], bfs(i, adj, visited, visited[i], n));
            }
        }
        for (int group : comp) {
            ans += group;
        }
        return ans;
    }

    private int bfs(int start, List<List<Integer>> adj, int[] visited, int count, int n) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = count;
        int ans = 1;
        int[] group = new int[n + 1];
        q.add(start);
        group[start] = 1;
        while (!q.isEmpty()) {
            int node = q.remove();
            for (int adjN : adj.get(node)) {
                if (group[adjN] == 0) {
                    visited[adjN] = count;
                    group[adjN] = group[node] + 1;
                    q.add(adjN);
                    ans = Math.max(ans, group[adjN]);
                } else if (Math.abs(group[adjN] - group[node]) != 1) {
                    return -1;
                }
            }
        }
        return ans;
    }
}
