package g3801_3900.s3820_pythagorean_distance_nodes_in_a_tree;

// #Medium #Tree #Staff #Weekly_Contest_486 #Breadth_First_Search
// #2026_06_09_Time_96_ms_(90.83%)_Space_234.88_MB_(70.83%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    int[] bfs(int n, List<Integer>[] adj, int start) {
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[start] = 0;

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(start);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj[u]) {
                // Check if this neighbour was not visited yet
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    q.add(v);
                }
            }
        }
        return dist;
    }

    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        ArrayList<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        // Calculate distances from every node to x, y and z
        int[] dx = bfs(n, adj, x);
        int[] dy = bfs(n, adj, y);
        int[] dz = bfs(n, adj, z);

        int result = 0;
        for (int i = 0; i < n; i++) {
            long a = dx[i];
            int b = dy[i];
            int c = dz[i];

            // Ensure a <= b <= c
            if (a > b) {
                long t = a;
                a = b;
                b = (int) t;
            }
            if (b > c) {
                long t = b;
                b = c;
                c = (int) t;
            }
            if (a > b) {
                long t = a;
                a = b;
                b = (int) t;
            }

            result += (a * a + (long) b * b == (long) c * c) ? 1 : 0;
        }

        return result;
    }
}
