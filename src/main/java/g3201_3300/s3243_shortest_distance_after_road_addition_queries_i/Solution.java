package g3201_3300.s3243_shortest_distance_after_road_addition_queries_i;

// #Medium #Array #Graph #Breadth_First_Search
// #2024_08_06_Time_6_ms_(100.00%)_Space_45.6_MB_(67.96%)

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = i;
        }
        ArrayList<Integer>[] parent = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            parent[i] = new ArrayList<>();
            if (i != n - 1) {
                parent[i].add(i + 1);
            }
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];
            if (dist[v] > dist[u] + 1) {
                dist[v] = dist[u] + 1;
                parent[u].add(v);
                updateDistance(v, dist, parent);
            } else {
                parent[u].add(v);
            }
            ans[i] = dist[n - 1];
        }
        return ans;
    }

    public void updateDistance(int par, int[] dist, ArrayList<Integer>[] parent) {
        for (int i = 0; i < parent[par].size(); i++) {
            int child = parent[par].get(i);
            if (dist[child] > dist[par] + 1) {
                dist[child] = dist[par] + 1;
                updateDistance(child, dist, parent);
            }
        }
    }
}
