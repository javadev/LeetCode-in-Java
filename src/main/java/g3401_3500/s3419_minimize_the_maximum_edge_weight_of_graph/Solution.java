package g3401_3500.s3419_minimize_the_maximum_edge_weight_of_graph;

// #Medium #2025_01_14_Time_51_(99.43%)_Space_119.08_(34.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings({"unchecked", "unused", "java:S1172"})
public class Solution {
    public int minMaxWeight(int n, int[][] edges, int threshold) {
        List<int[]>[] reversedG = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            reversedG[i] = new ArrayList<>();
        }
        for (int[] i : edges) {
            int a = i[0];
            int b = i[1];
            int w = i[2];
            reversedG[b].add(new int[] {a, w});
        }
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;
        if (reversedG[0].size().isEmpty()) {
            return -1;
        }
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        while (!que.isEmpty()) {
            int cur = que.poll();
            for (int[] next : reversedG[cur]) {
                int node = next[0];
                int w = next[1];
                int nextdis = Math.max(w, distance[cur]);
                if (nextdis < distance[node]) {
                    distance[node] = nextdis;
                    que.add(node);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                return -1;
            }
            ans = Math.max(ans, distance[i]);
        }
        return ans;
    }
}
