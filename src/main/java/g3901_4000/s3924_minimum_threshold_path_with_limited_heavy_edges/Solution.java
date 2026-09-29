package g3901_4000.s3924_minimum_threshold_path_with_limited_heavy_edges;

// #Hard #Binary_Search #Senior_Staff #Biweekly_Contest_182 #Breadth_First_Search #Graph_Theory
// #2026_09_29_Time_30_ms_(98.28%)_Space_47.81_MB_(58.62%)

import java.util.ArrayDeque;
import java.util.Arrays;

public class Solution {
    private int[] head;
    private int[] to;
    private int[] weight;
    private int[] next;
    private int n;
    private int source;
    private int target;
    private int k;

    public int minimumThreshold(int n, int[][] edges, int source, int target, int k) {
        if (source == target) {
            return 0;
        }
        this.n = n;
        this.source = source;
        this.target = target;
        this.k = k;
        // make adj list (you dont have to do this fancy version, standard adj list works)
        int m = edges.length;
        this.head = new int[n];
        this.to = new int[m << 1];
        this.weight = new int[m << 1];
        this.next = new int[m << 1];
        Arrays.fill(head, -1);
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            int c = edges[i][2];
            to[i << 1] = b;
            next[i << 1] = head[a];
            head[a] = i << 1;
            to[i << 1 | 1] = a;
            next[i << 1 | 1] = head[b];
            head[b] = i << 1 | 1;
            weight[i << 1] = weight[i << 1 | 1] = c;
        }
        // check if it's possible to reach the target at all
        if (!check(Integer.MAX_VALUE)) {
            return -1;
        }
        if (k == m) {
            return 0;
        }
        int left = 0;
        int right = 0;
        // set right pointer to max edge weight, cuz any threshold larger than that is pointless
        for (int[] edge : edges) {
            if (edge[2] > right) {
                right = edge[2];
            }
        }
        // binary search on the answer
        while (left < right) {
            int mid = left + right >>> 1;
            if (check(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean check(int threshold) {
        // 0-1 BFS
        int[] dist = new int[n];
        Arrays.fill(dist, k + 1);
        dist[source] = 0;
        ArrayDeque<Integer> queue = new ArrayDeque<>(n);
        queue.add(source);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == target) {
                return true;
            }
            int currentDist = dist[current];
            // go through each adj node (a regular adj list works here as well)
            for (int i = head[current]; i != -1; i = next[i]) {
                int node = to[i];
                int newWeight = weight[i] > threshold ? 1 : 0;
                int newDist = newWeight + currentDist;
                if (newDist < dist[node]) {
                    dist[node] = newDist;
                    if (newWeight == 0) {
                        queue.addFirst(node);
                    } else {
                        queue.addLast(node);
                    }
                }
            }
        }
        return false;
    }
}
