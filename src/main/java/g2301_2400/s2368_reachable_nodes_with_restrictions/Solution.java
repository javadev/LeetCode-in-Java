package g2301_2400.s2368_reachable_nodes_with_restrictions;

// #Medium #Array #Tree #Graph #Hash_Table #Depth_First_Search #Breadth_First_Search
// #2022_08_15_Time_88_ms_(42.86%)_Space_201.1_MB_(14.29%)

import java.util.LinkedList;

public class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        LinkedList<Integer>[] adj = new LinkedList[n];
        for (int i = 0; i < n - 1; i++) {
            if (adj[edges[i][0]] == null) {
                LinkedList<Integer> source = new LinkedList<>();
                source.add(edges[i][1]);
                adj[edges[i][0]] = source;
            } else {
                adj[edges[i][0]].add(edges[i][1]);
            }

            if (adj[edges[i][1]] == null) {
                LinkedList<Integer> dest = new LinkedList<>();
                dest.add(edges[i][0]);
                adj[edges[i][1]] = dest;
            } else {
                adj[edges[i][1]].add(edges[i][0]);
            }
        }

        boolean[] visited = new boolean[n];
        for (int res : restricted) {
            visited[res] = true;
        }

        int count = 1;
        visited[0] = true;
        return countReachableNodes(0, adj, visited, count);
    }

    private int countReachableNodes(
            int source, LinkedList<Integer>[] adj, boolean[] visited, int count) {
        for (int neighbour : adj[source]) {
            if (!visited[neighbour]) {
                visited[neighbour] = true;
                count = countReachableNodes(neighbour, adj, visited, ++count);
            }
        }
        return count;
    }
}
