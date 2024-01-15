package g2901_3000.s2959_number_of_possible_sets_of_closing_branches;

// #Hard #Bit_Manipulation #Heap_Priority_Queue #Graph #Enumeration #Shortest_Path
// #2024_01_15_Time_36_ms_(83.41%)_Space_44.9_MB_(14.96%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    private int get(int n, int maxDis, int mask, List<List<int[]>> al) {
        int nodes = 0;
        boolean[] m = new boolean[n];
        for (int i = 0; i < n; i++) {
            int val = mask & (1 << i);
            if (val > 0) {
                m[i] = true;
                nodes++;
            }
        }
        if (nodes == n) {
            return 1;
        }
        for (int startVertex = 0; startVertex < n; startVertex++) {
            if (m[startVertex]) {
                continue;
            }
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[] {startVertex, 0});
            int[] dis = new int[n];
            Arrays.fill(dis, Integer.MAX_VALUE);
            dis[startVertex] = 0;
            int nodeCount = 1;
            while (!q.isEmpty()) {
                int[] curr = q.poll();
                for (int[] adj : al.get(curr[0])) {
                    if (!m[adj[0]] && curr[1] + adj[1] <= dis[adj[0]]) {
                        if (dis[adj[0]] == Integer.MAX_VALUE) {
                            nodeCount++;
                        }
                        dis[adj[0]] = curr[1] + adj[1];
                        q.add(new int[] {adj[0], dis[adj[0]]});
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (!m[i] && dis[i] > maxDis) {
                    return 0;
                }
            }
            if (nodes != n - nodeCount) {
                return 0;
            }
        }
        return 1;
    }

    private int solve(int n, int maxDis, List<List<int[]>> al) {
        int res = 0;
        for (int i = 0; i < (1 << n); i++) {
            res += get(n, maxDis, i, al);
        }
        return res;
    }

    public int numberOfSets(int n, int maxDistance, int[][] roads) {
        List<List<int[]>> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(new ArrayList<>());
        }
        for (int[] edge : roads) {
            al.get(edge[0]).add(new int[] {edge[1], edge[2]});
            al.get(edge[1]).add(new int[] {edge[0], edge[2]});
        }
        return solve(n, maxDistance, al);
    }
}
