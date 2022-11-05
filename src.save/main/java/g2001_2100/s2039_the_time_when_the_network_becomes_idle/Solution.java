package g2001_2100.s2039_the_time_when_the_network_becomes_idle;

// #Medium #Array #Breadth_First_Search #Graph
// #2022_05_29_Time_134_ms_(72.29%)_Space_145.3_MB_(56.63%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int networkBecomesIdle(int[][] edges, int[] pat) {
        int n = pat.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] arr : edges) {
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
        }
        int[] distance = new int[n];
        Arrays.fill(distance, 99999);
        distance[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a1, a2) -> Integer.compare(a1[1], a2[1]));
        pq.add(new int[] {0, 0});
        while (!pq.isEmpty()) {
            int[] a = pq.poll();
            int node = a[0];
            for (Integer nn : adj.get(node)) {
                if (distance[node] + 1 < distance[nn]) {
                    distance[nn] = 1 + distance[node];
                    pq.add(new int[] {nn, distance[nn]});
                }
            }
        }
        int max = 0;
        for (int i = 1; i < n; i++) {
            int num1 = 2 * distance[i];
            int num2 = num1 / pat[i];
            if (num1 % pat[i] != 0) {
                num2++;
            }
            num2--;
            num2 *= pat[i];
            max = Math.max(max, num2 + num1);
        }
        return max + 1;
    }
}
