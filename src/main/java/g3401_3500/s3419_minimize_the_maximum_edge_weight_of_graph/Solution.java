package g3401_3500.s3419_minimize_the_maximum_edge_weight_of_graph;

// #Medium #Binary_Search #Graph #Shortest_Path #Depth_First_Search #Breadth_First_Search
// #2025_01_15_Time_64_(99.28%)_Space_110.17_(57.63%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings({"unchecked", "unused", "java:S1172"})
public class Solution {
    private ArrayList<ArrayList<Pair>> revadj;

    private static class Pair {
        int node;
        int weight;

        public Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public int minMaxWeight(int n, int[][] edges, int threshold) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        revadj = new ArrayList<>();
        for (int i = 0; i <= n + 1; i++) {
            adj.add(new ArrayList<>());
            revadj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new Pair(v, wt));
            revadj.get(v).add(new Pair(u, wt));
        }
        if (!check(n)) {
            return -1;
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, (int) (1e9));
        dist[0] = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, 0));
        while (!q.isEmpty()) {
            int u = q.peek().node;
            int currMax = q.peek().weight;
            q.poll();
            for (int i = 0; i < revadj.get(u).size(); i++) {
                int v = revadj.get(u).get(i).node;
                int wt = revadj.get(u).get(i).weight;
                if (dist[v] > Math.max(wt, currMax)) {
                    dist[v] = Math.max(wt, currMax);
                    q.offer(new Pair(v, dist[v]));
                }
            }
        }
        int maxi = dist[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, dist[i]);
        }
        return maxi;
    }

    private boolean check(int n) {
        int[] vis = new int[n];
        ArrayList<Integer> nodes = new ArrayList<>();
        dfs(0, vis, nodes);
        return nodes.size() == n;
    }

    private void dfs(int u, int[] vis, ArrayList<Integer> nodes) {
        nodes.add(u);
        vis[u] = 1;
        for (int i = 0; i < revadj.get(u).size(); i++) {
            int v = revadj.get(u).get(i).node;
            if (vis[v] == 0) {
                dfs(v, vis, nodes);
            }
        }
    }
}
