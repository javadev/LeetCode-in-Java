package g3901_4000.s3970_shortest_path_with_at_most_k_consecutive_identical_characters;

// #Medium #String #Heap_Priority_Queue #Shortest_Path #Graph_Theory #Staff #Weekly_Contest_507
// #2026_11_03_Time_40_ms_(97.73%)_Space_198.21_MB_(98.49%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    private static class Node {
        long w;
        int ch;
        int city;

        public Node(int city, long w, int ch) {
            this.city = city;
            this.w = w;
            this.ch = ch;
        }
    }

    public int shortestPath(int n, int[][] edges, String labelschars, int k) {
        int[] chars = new int[n];
        char[] labels = labelschars.toCharArray();
        Arrays.fill(chars, Integer.MAX_VALUE);
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new int[] {edge[1], edge[2]});
        }
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> Long.compare(a.w, b.w));
        pq.add(new Node(0, 0, 1));
        while (!pq.isEmpty()) {
            Node nd = pq.poll();
            if (nd.ch >= chars[nd.city]) {
                continue;
            }
            chars[nd.city] = nd.ch;
            if (nd.city == n - 1) {
                return (int) nd.w;
            }
            addNeighbors(nd, adj, labels, k, pq);
        }
        return -1;
    }

    private void addNeighbors(
            Node nd, List<List<int[]>> adj, char[] labels, int k, PriorityQueue<Node> pq) {
        for (int[] nbr : adj.get(nd.city)) {
            int nextCity = nbr[0];
            int totalCh = getNextCharCount(nd.ch, labels[nd.city], labels[nextCity]);
            if (nd.city != nextCity && totalCh <= k) {
                long totalWeight = nd.w + nbr[1];

                pq.add(new Node(nextCity, totalWeight, totalCh));
            }
        }
    }

    private int getNextCharCount(int ch, char current, char next) {
        return current == next ? ch + 1 : 1;
    }
}
