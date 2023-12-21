package g1901_2000.s1976_number_of_ways_to_arrive_at_destination;

// #Medium #Dynamic_Programming #Graph #Topological_Sort #Shortest_Path
// #2022_05_21_Time_14_ms_(77.59%)_Space_55.5_MB_(27.59%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class Solution {
    private int dijkstra(int[][] roads, int n) {
        long mod = (int) 1e9 + 7L;
        Queue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(l -> l[1]));
        long[] ways = new long[n];
        long[] dist = new long[n];
        Arrays.fill(dist, (long) 1e18);
        dist[0] = 0;
        ways[0] = 1;
        ArrayList<long[]>[] graph = new ArrayList[n];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] road : roads) {
            graph[road[0]].add(new long[] {road[1], road[2]});
            graph[road[1]].add(new long[] {road[0], road[2]});
        }
        pq.add(new long[] {0, 0});
        if (!pq.isEmpty()) {
            while (!pq.isEmpty()) {
                long[] ele = pq.remove();
                long dis = ele[1];
                long node = ele[0];
                for (long[] e : graph[(int) node]) {
                    long wt = e[1];
                    long adjNode = e[0];
                    if (wt + dis < dist[(int) adjNode]) {
                        dist[(int) adjNode] = wt + dis;
                        ways[(int) adjNode] = ways[(int) node];
                        pq.add(new long[] {adjNode, dist[(int) adjNode]});
                    } else if (wt + dis == dist[(int) adjNode]) {
                        ways[(int) adjNode] = (ways[(int) node] + ways[(int) adjNode]) % mod;
                    }
                }
            }
        }
        return (int) ways[n - 1];
    }

    public int countPaths(int n, int[][] roads) {
        return dijkstra(roads, n);
    }
}
